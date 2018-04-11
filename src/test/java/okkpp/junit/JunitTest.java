package okkpp.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

import okkpp.base.BaseTest;
import okkpp.utils.FTPUtil;


/**
* @author duck
* @date 创建时间：2018年3月28日 上午9:26:16
*/
public class JunitTest extends BaseTest{

	@Value(value = "${ftp.HOST}")
	private String HOST;
	@Value(value = "${ftp.PORT}")
	private int PORT;
	@Value(value = "${ftp.UserName}")
	private String UserName;
	@Value(value = "${ftp.PassWord}")
	private String PassWord;
	@Value(value = "${ftp.BASE_PATH}")
	private String BASE_PATH;

	public void test() throws FileNotFoundException {
		File f = new File("B:\\duck.png");
		FileInputStream file = new FileInputStream(f);
		FTPUtil ftp = new FTPUtil();
		ftp.SFTPUpload(HOST, PORT, UserName, PassWord, BASE_PATH, file, "duck.png");
	}

	@Test
	public void resolveData() {
		File f = new File("B:\\download_excel\\Cause of death, by injury (% of total).xls");
	}
}
