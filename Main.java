public class Main {
	
public static void main(String[] args) {
	String firstNames[] = {"Saman", "Sadun", "Harsha", "Nalin"};
	String lastNames[] = {"Kumara", "Bandara", "Perera", "Premarathna"};
	
	displayFullNames(firstNames, lastNames);
	
	int error[] = {401,403,404};
	generateError(error);
	
}

private static void generateError(int[] error) {
	StringBuffer b = new StringBuffer();
	for (int i : error) {
		switch(i) {
		case 400:
			b.append("400 : Bad Request \n");
			break;
		case 401:
			b.append("401 : Unauthorized \n");
			break;
		case 402:
			b.append("402 : Payment Required \n");
			break;
		case 403:
			b.append("403 : Forbidden \n");
			break;
		case 404:
			b.append("404 : Not Found \n");
			break;
		case 405:
			b.append("405 : Bad Method Not Allowed \n");
			break;
		}
	}
	System.out.println(b);
}

private static void displayFullNames(String[] firstNames, String[] lastNames) {
	StringBuilder b = new StringBuilder();
	for (int i = 0; i < lastNames.length; i++) {
		b.append(firstNames[i]);
		b.append(' ');
		b.append(lastNames[i]);
		b.append(' ');
	}
	System.out.println(b);
}
}
