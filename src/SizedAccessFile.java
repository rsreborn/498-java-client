/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class SizedAccessFile
{
	private File file;
	private RandomAccessFile aRandomAccessFile972;
	private long size;
	private long position;
	
	public final void method1201(int i) throws IOException {
		if (i == 1) {
			if (aRandomAccessFile972 != null) {
				aRandomAccessFile972.close();
				aRandomAccessFile972 = null;
			}
		}
	}
	
	public final int method1202(boolean bool, byte[] bs, int i, int i_0_) throws IOException {
		if (bool != true) {
			position = 90L;
		}
		int i_1_ = aRandomAccessFile972.read(bs, i_0_, i);
		if (i_1_ > 0) {
			position += (long) i_1_;
		}
		return i_1_;
	}
	
	public final long method1203(byte b) throws IOException {
		if (b >= -81) {
			return -125L;
		}
		return aRandomAccessFile972.length();
	}
	
	public final File method1204(boolean bool) {
		if (bool != true) {
			file = null;
		}
		return file;
	}
	
	public final void method1205(byte[] bs, int i, int i_2_, int i_3_) throws IOException {
		if (size < position + (long) i_2_) {
			aRandomAccessFile972.seek(size - -1L);
			aRandomAccessFile972.write(1);
			throw new EOFException();
		}
		aRandomAccessFile972.write(bs, i, i_2_);
		position += (long) i_2_;
		if (i_3_ != 1) {
			file = null;
		}
	}
	
	public final void method1206(byte b, long l) throws IOException {
		aRandomAccessFile972.seek(l);
		if (b == -29) {
			position = l;
		}
	}
	
	protected final void finalize() throws Throwable {
		if (aRandomAccessFile972 != null) {
			System.out.println("Warning! fileondisk " + file + " not closed correctly using close(). Auto-closing instead. ");
			method1201(1);
		}
	}
	
	public SizedAccessFile(File file, String string, long size) throws IOException {
		if (size == -1L) {
			size = 9223372036854775807L;
		}
		if (file.length() >= size) {
			file.delete();
		}
		aRandomAccessFile972 = new RandomAccessFile(file, string);
		position = 0L;
		this.file = file;
		this.size = size;
		int i = aRandomAccessFile972.read();
		if ((i ^ 0xffffffff) != 0 && !string.equals("r")) {
			aRandomAccessFile972.seek(0L);
			aRandomAccessFile972.write(i);
		}
		aRandomAccessFile972.seek(0L);
	}
}
