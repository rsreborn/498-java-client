/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class62
{
	private File aFile971;
	private RandomAccessFile aRandomAccessFile972;
	private long aLong973;
	private long aLong974;
	
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
			aLong974 = 90L;
		}
		int i_1_ = aRandomAccessFile972.read(bs, i_0_, i);
		if (i_1_ > 0) {
			aLong974 += (long) i_1_;
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
			aFile971 = null;
		}
		return aFile971;
	}
	
	public final void method1205(byte[] bs, int i, int i_2_, int i_3_) throws IOException {
		if (aLong973 < aLong974 + (long) i_2_) {
			aRandomAccessFile972.seek(aLong973 - -1L);
			aRandomAccessFile972.write(1);
			throw new EOFException();
		}
		aRandomAccessFile972.write(bs, i, i_2_);
		aLong974 += (long) i_2_;
		if (i_3_ != 1) {
			aFile971 = null;
		}
	}
	
	public final void method1206(byte b, long l) throws IOException {
		aRandomAccessFile972.seek(l);
		if (b == -29) {
			aLong974 = l;
		}
	}
	
	protected final void finalize() throws Throwable {
		if (aRandomAccessFile972 != null) {
			System.out.println("Warning! fileondisk " + aFile971 + " not closed correctly using close(). Auto-closing instead. ");
			method1201(1);
		}
	}
	
	Class62(File file, String string, long l) throws IOException {
		if (l == -1L) {
			l = 9223372036854775807L;
		}
		if (file.length() >= l) {
			file.delete();
		}
		aRandomAccessFile972 = new RandomAccessFile(file, string);
		aLong974 = 0L;
		aFile971 = file;
		aLong973 = l;
		int i = aRandomAccessFile972.read();
		if ((i ^ 0xffffffff) != 0 && !string.equals("r")) {
			aRandomAccessFile972.seek(0L);
			aRandomAccessFile972.write(i);
		}
		aRandomAccessFile972.seek(0L);
	}
}
