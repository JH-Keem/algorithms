package algorithms.boj.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q10431_WithClass {
	
	//	키 속성을 갖는 학생 클래스를 만들어 객체로 관리하기
	private static class Student{
		int height;
		
		public Student(int height) {
			this.height = height;
		}	
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//	테스트케이스의 수 입력받기
		int P = Integer.parseInt(br.readLine());
		
		//	P만큼 반복하며, 각 테스트 케이스가 수행할 내용
		for(int t = 1; t <= P; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			//	현재 테스트 케이스의 번호
			int T = Integer.parseInt(st.nextToken());
			
			List<Student> students = new ArrayList<>();
			
			//	학생 수는 20명으로 제한되어 있으므로 20번 반복
			for(int i = 0; i < 20; i++) {
				//	입력되는 학생의 키를 가지고 학생 객체를 만들어 일단 줄을 세운다
				int height = Integer.parseInt(st.nextToken());
				students.add(new Student(height));
			}
			
			//	세워진 학생들을 다시 줄세우는 기능을 실행하고, 반환되는 결과를 출력한다.
			int result = lineUp(students);
			System.out.println(T + " " + result);
		}
		
		br.close();
	}
	
	//	줄세우기
	public static int lineUp(List<Student> students) {
		int totalMoves = 0;
		List<Student> line = new ArrayList<>();
		
		//	입력받은 학생 배열을 통해 
		for(Student student : students) {
			int position = findCorrectPosition(line, student);
			totalMoves += line.size() - position;
			line.add(position, student);
		}
		return totalMoves;
	}
	
	//	자기 위치 찾기
	private static int findCorrectPosition(List<Student> line, Student student) {
		int position = 0;
		//	맨 앞 위치(position)에서부터(줄 크기안에서 반복) AND 해당 위치(position)학생의 키가 나보다 작을때 position ++
		//	=> 
		while(position < line.size() && line.get(position).height < student.height) {
			position++;
		}
		return position;
	}
}

