package hac.chapter2;

public class Common {
	public static void main(String[] args){
		String str = "hello word";
		String s = lpad(str,str.length(),'0');
		String format = "%1$#" + 50 + "s";
		System.out.println(format);
		System.out.println(String.format(format, str));
	}

	public static String lpad(String str, int length, char pad) {
		return String.format("%1$#" + length + "s", str).replace(' ', pad);
	}
	
}
