package load_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
 
public class DownloadAction extends ActionSupport{
 
	private static final long serialVersionUID = 9149826260758390091L;
	private InputStream fileInputStream;
	private String fileContentType;
	private List<DownloadFile> downLoadList = new ArrayList<DownloadFile>();
	
	public List<DownloadFile> getDownLoadList() {
		return downLoadList;
	}

	public void setDownLoadList(List<DownloadFile> downLoadList) {
		this.downLoadList = downLoadList;
	}

	public List<String> getFilesList() {
		return filesList;
	}

	public void setFilesList(List<String> filesList) {
		this.filesList = filesList;
	}

	private List<String> filesList = new ArrayList<String>();
 	
	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	private String destPath;
	private String myFileFileName="plot.log";
	
	public String getDestPath() {
		return destPath;
	}

	public void setDestPath(String destPath) {
		this.destPath = destPath;
	}

	public String getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}

	public void setFileInputStream(InputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}

	 public InputStream getFileInputStream() {
		return fileInputStream;
	}
 
	public String execute() throws Exception {
	    
		destPath = "F:/Master_Hori/Proiect/Aplicatie/WebContent/Files";
		fileInputStream = new FileInputStream(new File(destPath,myFileFileName));
		return SUCCESS;
	}
	
	public String test()  throws Exception {
	    
		
		filesList = new  ArrayList<String>();
        downLoadList = new ArrayList<DownloadFile>();
		
		File folder = new File("Files");
		File[] listOfFiles = folder.listFiles();

		System.out.println("------------------------------");		
		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        System.out.println(file.getAbsolutePath());
		        this.filesList.add(file.getAbsolutePath());
		        
		        DownloadFile downloadFile = new DownloadFile();
		        downloadFile.file_name = file.getName();
                downloadFile.inputStream = new FileInputStream(file);
                
                downLoadList.add(downloadFile);
		    }
		}
		 
		return SUCCESS;
	}	
	
}


class DownloadFile{
	
	public String file_name;
	public FileInputStream inputStream;
	
}