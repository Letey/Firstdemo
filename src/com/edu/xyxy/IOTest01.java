package com.edu.xyxy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest01 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		FileWriter fw=null;
		try{
			fw=new FileWriter("D:\\dream_copy.txt");
			fr= new FileReader("D:\\dream.txt");
			char[] buf = new char[102400];
			int num=0;
			while((num=fr.read(buf)) !=-1){
				fw.write(buf,0,num);
			}
		}
			catch (IOException e) {
				// TODO: handle exception
				throw new RuntimeException("文件没找到！！");
			}
			finally{
				try{
					if(fr!=null)
						fr.close();
				}
				catch (IOException e) {
					// TODO: handle exception
					throw new RuntimeException("文件没找到！！");
				}finally{
				try{
					if(fw!=null)
						fw.close();
				}
				catch (IOException e) {
					// TODO: handle exception
					throw new RuntimeException("文件copy失败！！");
				}
				}
			}
		//2.从硬盘中读取文件
		/*FileReader re=null;
		try{
		re = new FileReader("D:\\dream.txt");
		char[] buf = new char[102400];
		int num=0;	
		while((num=re.read(buf)) !=-1)
		{
			System.out.print(new String(buf,0,num));
			String str = new String(buf,0,num);
		} 
		}
		catch (IOException e) {
			// TODO: handle exception
			throw new RuntimeException("文件读取失败！！");
		}
		finally
		{			
				try{
					if(re!=null)
						re.close();
				}
				catch (IOException e) {
					throw new RuntimeException("文件找不到！！");
				}
		}*/
		
		//1.在一个字符串中找到某个字符出现的次数
		/*String str ="I have a dream! well, i will do all to complete it!";
		String cha = "";
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='a' || ch=='i')
				cha+=ch;
		}
		System.out.print(cha+"\n");
		System.out.print(cha.length());
		char[] chae = cha.toCharArray();
		System.out.print(chae[4]);
		*/
	}

}
