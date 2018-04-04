package okkpp.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

/**
* @author duck
* @date 创建时间：2018年4月4日 上午10:13:48
*/
public class JTest {

	public static void main(String[] args) throws JSchException, SftpException, FileNotFoundException {
		Session session = null;  
        Channel channel = null;  
  
        JSch jsch = new JSch();  
        session = jsch.getSession("root", "112.74.72.205", 22);  
        session.setPassword("DUCKokkpp1019");  
        session.setTimeout(100000);  
        Properties config = new Properties();  
        config.put("StrictHostKeyChecking", "no");  
        session.setConfig(config);  
        session.connect();  
  
        channel = session.openChannel("sftp");  
        channel.connect();  
        ChannelSftp chSftp = (ChannelSftp) channel;
        File f = new File("B:\\test.png");
        System.out.println(f.getAbsolutePath());
        FileInputStream file = new FileInputStream(f);
        chSftp.put(file, "/tomcat/webapps/images/test.png");

        chSftp.quit();
        channel.disconnect();
        session.disconnect();
	}

}
