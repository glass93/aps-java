package 파일정리_20291;

import java.util.*;

class File implements Comparable<File> {
	public String end;
	public int cnt;
	
	public File(String end) {
		this.end = end;
	}
	
	public File(String end, int cnt) {
		this.end = end;
		this.cnt = cnt;
	}
	
	public int compareTo(File o) {
		return this.end.compareTo(o.end);
	}
}
class Main {
	public ArrayList<File> solution(int n, ArrayList<File> arr) {
		ArrayList<File> answer = new ArrayList<>();
		
		Collections.sort(arr);
		
		String curEnd = arr.get(0).end;
		int cnt = 1;
		
		for(int i = 1; i < arr.size(); i++) {
			if(arr.get(i).end.equals(curEnd)) {
				cnt++;
			}
			else {
				answer.add(new File(curEnd, cnt));
				cnt = 1;
				curEnd = arr.get(i).end;
			}
		}
		
		answer.add(new File(curEnd, cnt));
		
		
		Collections.sort(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<File> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String file = kb.next();
			String end = file.substring(file.indexOf('.') + 1);
			arr.add(new File(end));
		}
		for(File x : T.solution(n,  arr)) System.out.println(x.end + " " + x.cnt);
	}

}
