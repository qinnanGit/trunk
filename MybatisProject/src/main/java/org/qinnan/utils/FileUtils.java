package org.qinnan.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.artofsolving.jodconverter.OfficeDocumentConverter;
import org.artofsolving.jodconverter.office.DefaultOfficeManagerConfiguration;
import org.artofsolving.jodconverter.office.OfficeManager;
import org.docx4j.convert.out.pdf.PdfConversion;
import org.docx4j.convert.out.pdf.viaXSLFO.Conversion;
import org.docx4j.convert.out.pdf.viaXSLFO.PdfSettings;
import org.docx4j.fonts.IdentityPlusMapper;
import org.docx4j.fonts.Mapper;
import org.docx4j.fonts.PhysicalFont;
import org.docx4j.fonts.PhysicalFonts;
import org.docx4j.model.structure.MarginsWellKnown;
import org.docx4j.model.structure.SectionWrapper;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;

public class FileUtils {
	private String name;
    private static  OfficeManager officeManager;  
    //openOffice安装路径  
    private static String OPEN_OFFICE_HOME = "C:/Program Files (x86)/OpenOffice 4";  
    //服务端口  
    private static int OPEN_OFFICE_PORT[] = {8110};  
	
	public static void convertWithPOI(InputStream inpuFile, File outFile) { 
		 
		   try {

	            long start = System.currentTimeMillis();

	            InputStream is = new FileInputStream(
	                    new File("C:/Users/Administrator/Desktop/21.docx"));
	            WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage
	                    .load(is);
	            List<SectionWrapper> sections = wordMLPackage.getDocumentModel().getSections();
	            for (int i = 0; i < sections.size(); i++) {

	                System.out.println("sections Size" + sections.size());
	                wordMLPackage.getDocumentModel().getSections().get(i)
	                        .getPageDimensions().setMargins(MarginsWellKnown.MODERATE);
	            }
	            Mapper fontMapper = new IdentityPlusMapper();
	            fontMapper.getFontMappings().put("华文行楷", PhysicalFonts.getPhysicalFonts().get("STXingkai"));  
	            fontMapper.getFontMappings().put("华文仿宋", PhysicalFonts.getPhysicalFonts().get("STFangsong"));  
	            fontMapper.getFontMappings().put("隶书", PhysicalFonts.getPhysicalFonts().get("LiSu"));  
	            PhysicalFont font = PhysicalFonts.getPhysicalFonts().get(
	                    "Comic Sans MS");
	            fontMapper.getFontMappings().put("Algerian", font);

	            wordMLPackage.setFontMapper(fontMapper);
	            PdfSettings pdfSettings = new PdfSettings();
	            PdfConversion conversion = new Conversion(
	                    wordMLPackage);

	            OutputStream out = new FileOutputStream(new File(
	                    "D:\\1234.pdf"));
	            conversion.output(out, pdfSettings);
	            System.err.println("Time taken to Generate pdf  "
	                    + (System.currentTimeMillis() - start) + "ms");

	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	} 
	  /** 
     *  
     * office2Pdf 方法 
     * @descript：TODO 
     * @param inputFile 文件全路径 
     * @param pdfFilePath pdf文件全路径 
     * @return void 
     * @author lxz 
     * @return  
     */      
    public static void office2Pdf(String inputFile,String pdfFilePath) {  
          
        File pdfFile = new File(pdfFilePath);  
        if (pdfFile.exists()) {  
            pdfFile.delete();  
        }  
        try{  
            long startTime = System.currentTimeMillis();  
            //打开服务  
            startService();          
            OfficeDocumentConverter converter = new OfficeDocumentConverter(officeManager);  
            //开始转换  
            converter.convert(new File(inputFile),new File(pdfFilePath));  
            //关闭  
            stopService();  
            System.out.println("运行结束");  
        }catch (Exception e) {  
            // TODO: handle exception  
            e.printStackTrace();  
        }  
    }  
      
    public static void stopService(){  
        if (officeManager != null) {  
            officeManager.stop();  
        }  
    }  
      
    public static void startService(){  
        DefaultOfficeManagerConfiguration configuration = new DefaultOfficeManagerConfiguration();  
        try {  
            configuration.setOfficeHome(OPEN_OFFICE_HOME);//设置安装目录  
            configuration.setPortNumbers(OPEN_OFFICE_PORT); //设置端口  
            configuration.setTaskExecutionTimeout(1000 * 60 * 5L);  
            configuration.setTaskQueueTimeout(1000 * 60 * 60 * 24L);  
            officeManager = configuration.buildOfficeManager();  
            officeManager.start();    //启动服务  
        } catch (Exception ce) {  
            System.out.println("office转换服务启动失败!详细信息:" + ce);  
        }  
    }  	
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		office2Pdf("C:/Users/Administrator/Desktop/java开发-覃楠-简历.doc","D:/123.pdf");
	}
}
