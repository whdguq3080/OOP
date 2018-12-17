package real;

public class Calc {
	public String plus(String[] arr2) {
		String res = "";
		int a = Integer.parseInt(arr2[0]);
		int b = Integer.parseInt(arr2[2]);
		res = a+b+"";
		return res;
	}
	public String minus(String[] arr2) {
		String res = "";
		int a = Integer.parseInt(arr2[0]);
		int b = Integer.parseInt(arr2[2]);
		res = a-b+"";
		return res;
	}

	public String multi(String[] arr2) {
		String res = "";
		int a = Integer.parseInt(arr2[0]);
		int b = Integer.parseInt(arr2[2]);
		res = a*b+"";
		return res;
	}

	public String divid(String[] arr2) {
		String res = "";
		int a = Integer.parseInt(arr2[0]);
		int b = Integer.parseInt(arr2[2]);
		res = a/b+"";
		return res;
	}
	public String mod(String[] arr2) {
		String res = "";
		int a = Integer.parseInt(arr2[0]);
		int b = Integer.parseInt(arr2[2]);
		res = a%b+"";
		return res;
	}

	
}
