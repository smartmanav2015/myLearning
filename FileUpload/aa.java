/*import java.io.ByteArrayOutputStream;
import java.io.InputStream;


public class aa {
	
	public void uploadFile (){
		InputStream in= null; //From the FileUpload API;
		int bytesRead=0;
		int bytesToRead=4096;
		byte[] input = new byte[bytesToRead];
		ByteArrayOutputStream baos = null;
		while (bytesRead < bytesToRead) {
		  int result = in.read(input, bytesRead, bytesToRead - bytesRead);
		  if (result == -1) break;
		  bytesRead += result;
		  baos=new ByteArrayOutputStream();
		  baos.write(input,0,input.length);
		  Object content;
		content.appendContent(baos);//Content Management API
		  baos.close();  
		}
	}

}
*/