public class LighterColors {
	public static void main(String[] args) {
		int rColor = Integer.parseInt(args[0]);
		int gColor = Integer.parseInt(args[1]);
		int bColor = Integer.parseInt(args[2]);

		int numberOfColorsToGet = 5;

		// steps to decrease in each color 
		int rStep = (255 - rColor) / numberOfColorsToGet;
		int gStep = (255 - gColor) / numberOfColorsToGet;
		int bStep = (255 - bColor) / numberOfColorsToGet;

		for (int i = 1; i <= numberOfColorsToGet; i++) {
			int rColorNew = rColor + (rStep * i);
			int gColorNew = gColor + (gStep * i);
			int bColorNew = bColor + (bStep * i);

			System.out.println("rgb(" + rColorNew + ", " + gColorNew + ", " + bColorNew + ")");
		}
	}
}