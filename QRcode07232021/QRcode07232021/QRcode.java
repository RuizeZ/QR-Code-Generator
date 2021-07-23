package QRcode07232021;

public class QRcode {

	/**
	 * create new QR code
	 */
	public char[][] init(String baseString) {
		// TODO Auto-generated method stub
		char[][] binaryStringCharArray = new char[baseString.length()][8];
		for (int i = 0; i < baseString.length(); i++) {
			char baseChar = baseString.charAt(i);
			String binaryString = Integer.toBinaryString(baseChar);
			while (binaryString.length() < 8) {
				binaryString = '0' + binaryString;
//				System.out.println(binaryString);
			}
			for (int j = 0; j < binaryStringCharArray[0].length; j++) {
				binaryStringCharArray[i][j] = binaryString.charAt(j);
//				System.out.println(binaryStringCharArray[i][j]);
			}
		}
		return binaryStringCharArray;
	}

}
