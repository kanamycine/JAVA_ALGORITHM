import java.util.HashMap;

public class Main {
	HashMap<Long, Long> map = new HashMap<>();
	public long [] solution(long k, long [] room_number){
		long [] result = new long [room_number.length];

		for (int i = 0; i < room_number.length; i++) {
			result[i] = findVacant(room_number[i]);
		}
		return result;
	}

	public long findVacant(long targetRoomNumber){
		if(!map.containsKey(targetRoomNumber)){
			map.put(targetRoomNumber, targetRoomNumber + 1);
			return targetRoomNumber;
		}

		long nextRoom = map.get(targetRoomNumber);
		long vacantRoom = findVacant(nextRoom);
		map.put(targetRoomNumber, vacantRoom);
		return vacantRoom;
	}
}
