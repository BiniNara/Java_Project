package logins;

import java.time.LocalDateTime;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

import logins.Member;
public class Sample {
	
	public static Vector<String> getMemberName(){
		//칼럼 데이터
		Vector<String> memberName = new Vector<>();
		memberName.add("ID");
		memberName.add("USERNAME");
		memberName.add("PASSWORD");
		memberName.add("NAME");
		memberName.add("EMAIL");
		memberName.add("PHONE");
		memberName.add("CREATEDATE");
		
		return memberName;
	}
	
	public static Vector<Member> getMembers(){
		//Member 데이터
		Vector<Member> members = new Vector<>();
		members.add(new Member(1,"ljw","123456","ljw","aaaa@bbbb.com", "01012345678", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(2,"ljw","123456","ljw","aaaa@bbbb.com", "01012345678", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(3,"ljw","123456","ljw","aaaa@bbbb.com", "01012345678", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(4,"ljw","123456","ljw","aaaa@bbbb.com", "01012345678", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(5,"ljw","123456","ljw","aaaa@bbbb.com", "01012345678", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		
		
		return members;
	}
}
