package load_file;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException; 
import com.opensymphony.xwork2.ActionSupport;


public class uploadFile extends ActionSupport{
	  
	   private static final long serialVersionUID = 9149826260758390091L;
	   private File myFile;
	   private String myFileFileName;
	   private String destPath;

	   public String execute()
	   {
	      
	      destPath = "F:/Master_Hori/Proiect/Aplicatie/WebContent/Files";

	      try{
	     	 System.out.println("Src File name: " + myFile);
	     	 System.out.println("Dst File name: " + myFileFileName);
	     	    	 
	     	 File destFile  = new File(destPath, myFileFileName);
	    	 FileUtils.copyFile(myFile, destFile);
	  
	      }catch(IOException e){
	         e.printStackTrace();
	         return ERROR;
	      }

	      return SUCCESS;
	   }
	   
	   public String delete() throws IOException
	   {
		      
		      destPath = "F:/Master_Hori/Proiect/Aplicatie/WebContent/Files";
  	      
           
            File destFile  = new File(destPath, myFileFileName);
            destFile.delete();
		      
		      return SUCCESS;
		   }
	   
	   public File getMyFile() {
	      return myFile;
	   }
	   public void setMyFile(File myFile) {
	      this.myFile = myFile;
	   }
	  
	   public String getMyFileFileName() {
	      return myFileFileName;
	   }
	   public void setMyFileFileName(String myFileFileName) {
	      this.myFileFileName = myFileFileName;
	   }
	}
