package xlOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import methods.OrgHRMLib;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.jetty.http.SSORealm;

public class ExcelOps {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat fm=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String md=fm.format(d);
		System.out.println(md);
		md=((md.replace("/", "")).replace(" ", "")).replace(":","");
		System.out.println(md);
		
		String xlPath="E:\\ShanthiVijethaRecordings\\Workspace\\SleniumProject\\src\\testdata\\EmpReg.xlsx";
		String xlout="E:\\ShanthiVijethaRecordings\\Workspace\\SleniumProject\\src\\results\\EmpRes"+md+".xlsx";
		FileInputStream fi=new FileInputStream(xlPath);
		OrgHRMLib om=new OrgHRMLib();
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
//		XSSFRow r=ws.getRow(2);
//		XSSFCell c=r.getCell(2);
		
//		System.out.println(c.getStringCellValue());
		
		int Rc=ws.getLastRowNum();
		System.out.println(Rc);
		
		om.org_Launch("http://orangehrm.qedgetech.com");
		om.org_Login("Admin", "Qedge123!@#");
		
		
		for (int i = 1; i <= Rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.getCell(2);
			XSSFCell c3=r.createCell(3);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			String Eid=c2.getStringCellValue();
			
			System.out.println(f+"---"+l+"---"+Eid);
			
			String res=om.Org_EmpReg(f, l, Eid);
			
			c3.setCellValue(res);
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
	}

}