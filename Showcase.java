import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class Showcase {
public static Prize[] test() {
	Prize[] prizeList = readFile("./prizeList.txt");
	return prizeList;
}
public static Prize[] createPrizes() {
	Prize[] prizeList = readFile("./prizeList.txt");
	Prize[] randomPrize = new Prize[5];
	for(int i=0;i<5;i++) {
		Random r = new Random(50);
		randomPrize[i] = prizeList[r.nextInt()];
	}
	return randomPrize;
}
@SuppressWarnings("resource")
public static Prize[] readFile(String fileName)
{
	try
	{
		Scanner fileScanner = new Scanner(new File(fileName));
		int wordCount = 0;
		while(fileScanner.hasNextLine())
		{
			fileScanner.nextLine();
			wordCount++;
		}
		if(wordCount <= 0) 
			return null;
		Prize[] retArr = new Prize[wordCount];
		fileScanner = new Scanner(new File(fileName));
		for(int i=0;i<retArr.length;i++)
		{
			if(!fileScanner.hasNextLine())
				break;
			String[] splitin = fileScanner.nextLine().split("\t", 2);
			int xcost = Integer.parseInt(splitin[1]);
			String xprize = splitin[0];
			retArr[i] = new Prize(xprize, xcost);
		}
		return retArr;
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return null;
}
}
