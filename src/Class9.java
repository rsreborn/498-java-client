/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Class9 implements Runnable
{
	private Class60 aClass60_181;
	public Class62 aClass62_182;
	public static Method aMethod183;
	public static String aString184;
	private Class60 aClass60_185;
	public Class62 aClass62_186;
	private boolean aBoolean187;
	public Applet anApplet188 = null;
	public EventQueue anEventQueue189;
	public static int anInt190 = 3;
	public Class62[] aClass62Array191;
	private Thread aThread192;
	private Interface3 anInterface3_193;
	public File aFile194;
	private File aFile195;
	public static Method aMethod196;
	public Class62 aClass62_197;
	public static String aString198;
	private static String aString199;
	
	public final void method99(int i) {
		synchronized (this) {
			aBoolean187 = true;
			this.notifyAll();
		}
		try {
			aThread192.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		if (aClass62_186 != null) {
			try {
				aClass62_186.method1201(1);
			} catch (java.io.IOException ioexception) {
				/* empty */
			}
		}
		if (i <= 45) {
			method101(92, 112);
		}
		if (aClass62_197 != null) {
			try {
				aClass62_197.method1201(1);
			} catch (java.io.IOException ioexception) {
				/* empty */
			}
		}
		if (aClass62Array191 != null) {
			for (int i_0_ = 0; aClass62Array191.length > i_0_; i_0_++) {
				if (aClass62Array191[i_0_] != null) {
					try {
						aClass62Array191[i_0_].method1201(1);
					} catch (java.io.IOException ioexception) {
						/* empty */
					}
				}
			}
		}
		do {
			if (aClass62_182 != null) {
				try {
					aClass62_182.method1201(1);
				} catch (java.io.IOException ioexception) {
					break;
				}
				break;
			}
		} while (false);
	}
	
	private final Class60 method100(int i, int i_1_, byte b, int i_2_, Object object) {
		Class60 class60 = new Class60();
		class60.anObject953 = object;
		class60.anInt952 = i;
		class60.anInt950 = i_1_;
		synchronized (this) {
			if (aClass60_185 != null) {
				aClass60_185.aClass60_954 = class60;
				aClass60_185 = class60;
			} else {
				aClass60_185 = aClass60_181 = class60;
			}
			this.notify();
			if (b >= -14) {
				method99(3);
			}
		}
		return class60;
	}
	
	public final Class60 method101(int i, int i_3_) {
		if (i <= 2) {
			method107(null, -90, null);
		}
		return method100(i_3_, 3, (byte) -58, 0, null);
	}
	
	public final Class60 method102(URL url, int i) {
		if (i < 109) {
			method108(false);
		}
		return method100(0, 4, (byte) -38, 0, url);
	}
	
	private final void method103(String string, byte b, int i, int i_4_) {
		String[] strings = { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString199, "/tmp/", "" };
		if (b != 102) {
			method103(null, (byte) 57, -42, 71);
		}
		if (i < 32 || i > 34) {
			i = 32;
		}
		String[] strings_5_ = { ".jagex_cache_" + i, ".file_store_" + i };
		for (int i_6_ = 0; i_6_ < 2; i_6_++) {
			for (int i_7_ = 0; (strings_5_.length ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
				for (int i_8_ = 0; strings.length > i_8_; i_8_++) {
					try {
						String string_9_ = strings[i_8_];
						if (string_9_.length() > 0 && !new File(string_9_).exists()) {
							continue;
						}
						File file = new File(string_9_ + strings_5_[i_7_]);
						if (i_6_ == 1 && !file.exists()) {
							boolean bool = file.mkdir();
							if (!bool) {
								continue;
							}
						}
						if (aClass62_182 == null) {
							try {
								File file_10_ = new File(file, "random.dat");
								if (i_6_ == 1 || file_10_.exists()) {
									aClass62_182 = new Class62(file_10_, "rw", 25L);
								}
							} catch (Exception exception) {
								aClass62_182 = null;
							}
						}
						if (aFile195 == null) {
							try {
								file = new File(file, string);
								if (i_6_ == 1 && !file.exists()) {
									boolean bool = file.mkdir();
									if (!bool) {
										continue;
									}
								}
								File file_11_ = new File(file, "main_file_cache.dat2");
								if ((i_6_ ^ 0xffffffff) == -1 && !file_11_.exists()) {
									continue;
								}
								aClass62_186 = new Class62(file_11_, "rw", 104857600L);
								aClass62Array191 = new Class62[i_4_];
								for (int i_12_ = 0; i_12_ < i_4_; i_12_++)
									aClass62Array191[i_12_] = new Class62(new File(file, "main_file_cache.idx" + i_12_), "rw", 1048576L);
								aClass62_197 = new Class62(new File(file, "main_file_cache.idx255"), "rw", 1048576L);
								aFile194 = aFile195 = file;
							} catch (Exception exception) {
								try {
									aClass62_186.method1201(b + -101);
									for (int i_13_ = 0; (i_4_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++)
										aClass62Array191[i_13_].method1201(b ^ 0x67);
									aClass62_197.method1201(1);
								} catch (Exception exception_14_) {
									/* empty */
								}
								aClass62_186 = aClass62_197 = null;
								aClass62Array191 = null;
								aFile194 = aFile195 = null;
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
					if (aClass62_182 != null && aFile195 != null) {
						return;
					}
				}
			}
		}
		if (aFile195 == null) {
			throw new RuntimeException();
		}
	}
	
	public final Class60 method104(int i, Runnable runnable, byte b) {
		if (b != 72) {
			return null;
		}
		return method100(i, 2, (byte) -22, 0, runnable);
	}
	
	public final Class60 method105(String string, int i, int i_15_) {
		if (i_15_ < 42) {
			method99(-121);
		}
		return method100(i, 1, (byte) -41, 0, string);
	}
	
	public final void run() {
		for (;;) {
			Class60 class60;
			synchronized (this) {
				for (;;) {
					if (aBoolean187) {
						return;
					}
					if (aClass60_181 != null) {
						class60 = aClass60_181;
						aClass60_181 = aClass60_181.aClass60_954;
						if (aClass60_181 == null) {
							aClass60_185 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				int i = class60.anInt950;
				if (i == 1) {
					class60.anObject955 = new Socket(InetAddress.getByName((String) class60.anObject953), class60.anInt952);
				} else if (i != 2) {
					if (i != 4) {
						if (i == 8) {
							Object[] objects = (Object[]) class60.anObject953;
							class60.anObject955 = ((Class) objects[0]).getDeclaredMethod((String) objects[1], (Class[]) objects[2]);
						} else if (i == 9) {
							Object[] objects = (Object[]) class60.anObject953;
							class60.anObject955 = ((Class) objects[0]).getDeclaredField((String) objects[1]);
						} else {
							throw new Exception();
						}
					} else {
						class60.anObject955 = new DataInputStream(((URL) class60.anObject953).openStream());
					}
				} else {
					Thread thread = new Thread((Runnable) class60.anObject953);
					thread.setDaemon(true);
					thread.start();
					thread.setPriority(class60.anInt952);
					class60.anObject955 = thread;
				}
				class60.anInt951 = 1;
			} catch (Throwable throwable) {
				class60.anInt951 = 2;
			}
		}
	}
	
	public final Class60 method106(String string, Class[] var_classes, Class var_class, int i) {
		if (i != 2) {
			aThread192 = null;
		}
		return method100(0, 8, (byte) -102, 0, new Object[] { var_class, string, var_classes });
	}
	
	public final Class60 method107(Class var_class, int i, String string) {
		if (i >= -12) {
			return null;
		}
		return method100(0, 9, (byte) -125, 0, new Object[] { var_class, string });
	}
	
	public final Interface3 method108(boolean bool) {
		if (bool != true) {
			method107(null, -66, null);
		}
		return anInterface3_193;
	}
	
	public Class9(boolean bool, Applet applet, int i, String string, int i_16_) {
		aClass62_186 = null;
		aClass60_181 = null;
		aClass60_185 = null;
		aClass62_182 = null;
		aFile194 = null;
		aBoolean187 = false;
		aClass62_197 = null;
		aFile195 = null;
		aString184 = "1.1";
		aString198 = "Unknown";
		anApplet188 = applet;
		try {
			aString198 = System.getProperty("java.vendor");
			aString184 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			aString199 = System.getProperty("user.home");
			if (aString199 != null) {
				aString199 += "/";
			}
		} catch (Exception exception) {
			/* empty */
		}
		if (aString199 == null) {
			aString199 = "~/";
		}
		try {
			anEventQueue189 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		try {
			if (applet != null) {
				aMethod196 = applet.getClass().getMethod("setFocusTraversalKeysEnabled", new Class[] { Boolean.TYPE });
			} else {
				aMethod196 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[] { Boolean.TYPE });
			}
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (applet == null) {
				aMethod183 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[] { Boolean.TYPE });
			} else {
				aMethod183 = applet.getClass().getMethod("setFocusCycleRoot", new Class[] { Boolean.TYPE });
			}
		} catch (Exception exception) {
			/* empty */
		}
		if (bool) {
			method103(string, (byte) 102, i, i_16_);
		}
		aBoolean187 = false;
		aThread192 = new Thread(this);
		aThread192.setPriority(10);
		aThread192.setDaemon(true);
		aThread192.start();
	}
}
