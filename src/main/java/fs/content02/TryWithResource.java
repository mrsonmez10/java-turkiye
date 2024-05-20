package fs.content02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryWithResource {

	public String firstLineOfFile(String path, String defaultVal) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		}
		catch (IOException e) {
			// TODO: handle exception
			return defaultVal;
		} finally {
			br.close();
		}
	}

	public String firstLineOfFileWell(String path, String defaultVal) {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
		catch (IOException e) {
			return defaultVal;
		}
	}

	// Multiple usage
	public void copy(String src, String dst) throws IOException {
		try (InputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dst)) {
			byte[] buf = new byte[0];
			int n;
			while ((n = in.read(buf)) >= 0)
				out.write(buf, 0, n);
		}
	}

	// Attention
	public void copy2(String src, String dst) throws IOException {
		try (InputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dst)) {
			byte[] buf = new byte[0];
			int n;
			while ((n = in.read(buf)) >= 0)
				out.write(buf, 0, n);

			// Still it works correctly but "Repair Problem can occur with excel files..
			out.close();
			in.close();
		}
	}
}
