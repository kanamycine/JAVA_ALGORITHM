import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class k0608 {
	public static String solution(String s) throws Exception {
		String res = "";
		List<Photo> lst = new ArrayList<>();
		String[] arr = s.split("\n");
		Set<String> set= new HashSet<>();
		List<Photo> lst2 = new ArrayList<>();
		for (String s1 : arr) {
			String [] tmp = s1.split(",");
			SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			Date to = transFormat.parse(tmp[2]);
			Photo photo = new Photo(tmp[0], tmp[1], to);
			lst.add(photo);
			set.add(tmp[1]);
		}

		for (Photo photo : lst) {
			lst2.add(photo);
		}

		Collections.sort(lst2, new Comparator<Photo>(){
			public int compare(Photo p1, Photo p2){
				if(p1.date.getTime() - p2.date.getTime()>0){
					return 1;
				}
				else if(p1.date.getTime() - p2.date.getTime()<0){
					return -1;
				}
				else {
					return 0;
				}
			}
		});

		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> tenCheck = new HashMap<>();
		for (String s1 : set) {
			map.put(s1, 1);
			tenCheck.put(s1,0);
		}

		for (Photo photo : lst) {
			int cnt = tenCheck.get(photo.city);
			tenCheck.put(photo.city, cnt + 1);
		}


		for (Photo photo : lst2) {
			int cnt = map.get(photo.city);
			String origin = photo.city;
			if(tenCheck.get(photo.city) >= 10){
				if(cnt < 10) {
					photo.city = origin + "0" + cnt;
				}
				else {
					photo.city = photo.city+cnt;
				}
			}
			else{
				photo.city = photo.city+cnt;
			}
			cnt += 1;
			map.put(origin,cnt);
		}



		for (Photo photo : lst) {
			for(Photo photo2 : lst2){
				if(photo.name == photo2.name){
					res+= photo2.city + photo2.extension + "\n";
				}
			}
		}
		System.out.println(res);

		return res;


	}

	public static class Photo {
		String name;
		String city;
		Date date;
		String extension;

		public Photo(String name, String city, Date date) {
			this.name = name;
			this.city = city;
			this.date = date;
			int idx= name.indexOf(".");
			this.extension= name.substring(idx);
		}
	}

	public static void main(String[] args) throws Exception{
		String s = "photo.jpg, Warsaw, 2013-09-05 14:08:15\n"
				+ "john.png, London, 2015-06-20 15:13:22\n"
				+ "myFriends.png, Warsaw, 2013-09-05 14:07:13\n"
				+ "Eiffel.jpg, Paris, 2015-07-23 08:03:02\n"
				+ "pisatower.jpg, Paris, 2015-07-22 23:59:59\n"
				+ "BOB.jpg, London, 2015-08-05 00:02:03\n"
				+ "notredame.png, Paris, 2015-09-01 12:00:00\n"
				+ "me.jpg, Warsaw, 2013-09-06 15:40:22\n"
				+ "a.png, Warsaw, 2016-02-13 13:33:50\n"
				+ "b.jpg, Warsaw, 2016-01-02 15:12:22\n"
				+ "c.jpg, Warsaw, 2016-01-02 14:34:30\n"
				+ "d.jpg, Warsaw, 2016-01-02 15:15:01\n"
				+ "e.png, Warsaw, 2016-01-02 09:49:09\n"
				+ "f.png, Warsaw, 2016-01-02 10:55:32\n"
				+ "g.jpg, Warsaw, 2016-02-29 22:13:11";

		solution(s);

	}
}
