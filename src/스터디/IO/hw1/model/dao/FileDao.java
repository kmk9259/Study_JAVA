package 스터디.IO.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	Scanner sc = new Scanner(System.in);
	public FileDao() {
		// TODO Auto-generated constructor stub
	}
	public void fileSave()
	{
		String input;
		StringBuilder sb = new StringBuilder();
		System.out.println("파일에 저장할 내용을 입력하시오(\"exit\"을 입력하면 내용 입력 끝) :");
		while(true) 
		{
			input = sc.nextLine();
			if(input.equals("exit"))
				break;
			else 
				sb.append(input+"\n");
		}
		
		System.out.println("저장하시겠습니까? (y/n)");
		char store = sc.nextLine().charAt(0);
		BufferedWriter bw = null;
		if(store =='y' || store=='Y')
		{
			System.out.println("저장할 파일명을 입력해주세요 : ");
			String fileName = sc.nextLine();
			
			try {
				bw = new BufferedWriter(new FileWriter(fileName+".txt",true));	
				bw.write(sb+"\n");
				
				System.out.println(fileName+".txt 파일에 성공적으로 저장하였습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				if (bw!=null)
					try {
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}
		else
		{
			System.out.println("다시 메뉴로 돌아갑니다.");
		}	
	}

	public void fileOpen()
	{
		System.out.println("열기 할 파일명 :");
		String openFile = sc.nextLine();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(openFile+".txt"));
			String temp = "\n";

			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace(); 
			
			System.out.println("존재하는 파일이 없습니다.");
			}
		catch (IOException e) {			
			e.printStackTrace();
		}
		finally {			
			if (br!=null)
				try {
					br.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
		}
	}
	public void fileEdit()
	{
		System.out.println("수정 할 파일명 : ");
		String modify = sc.nextLine();
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		
		String input2;
		StringBuilder sb2 = new StringBuilder();
		try {
			br = new BufferedReader(new FileReader(modify+".txt"));
			String temp = "";

			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
			System.out.println("파일에 추가할 내용을 입력하시오 : ");
			
			while(true) 
			{
				input2 = sc.nextLine();
				if(input2.equals("exit"))
					break;
				else 
					sb2.append(input2);
			}
			System.out.println("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
			char add = sc.nextLine().charAt(0);
			if(add =='y' || add=='Y')
			{
				bw = new BufferedWriter(new FileWriter(modify+".txt",true));	
				bw.write(sb2+"\n");
				System.out.println(modify+".txt 파일의 내용이 변경되었습니다.");
			}
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException E) {
			E.printStackTrace();
		}
		finally {
			if (br!=null ||bw!=null)
				try {
					br.close();
					bw.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
		}
			
			
			
		
	}

}
