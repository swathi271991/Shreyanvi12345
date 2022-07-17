package xyz;

import java.io.IOException;

import Utils.XLUtils;

public class PageClass {
	
	String xlfile =  "C:\\Users\\graje\\OneDrive\\Desktop\\SIdata.xlsx";
	String xlsheet = "Sheet2";


	public Object[][]  getData() throws IOException
	{

		int rows = XLUtils.getRowCount(xlfile, xlsheet);
		int columns = XLUtils.getCellCount(xlfile, xlsheet, 1);

		Object obj[][] = new Object[rows][columns];

		for(int i = 1; i<=rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				obj[i-1][j] = XLUtils.getCellData(xlfile, xlsheet, i, j);
				System.out.println(obj[i-1][j]);
			}
		}

		return obj;

	}

}
