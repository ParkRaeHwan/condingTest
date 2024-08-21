package week1;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers {

    public static void main(String[] args) {
        int[] test = {10,10,10,10,10,10,10,10,10,10};
        System.out.println(solution(100, 100, test));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights){
        int result = 0;
        int bridge_weight = 0;
        Queue<Integer> trucks = new LinkedList<>();
        Queue<Integer> bridge_trucks = new LinkedList<>();
        Queue<Integer> truck_time = new LinkedList<>();
        for(int target : truck_weights){
            trucks.add(target);
        }

        while (!trucks.isEmpty()){
            // 다리위의 트럭의 이동거리 계산 (이동거리 이동후 해당 트럭 내리도록)
            if (!(bridge_trucks.isEmpty()) && truck_time.peek() == result){
                // 해당 트럭 이동 시간, 트럭 무게 감소
                truck_time.poll();
                bridge_weight -= bridge_trucks.poll();
            }
            // 트럭이 더 올라갈수 있는경우 (다리에 올라간 트럭의 총무게가 다리 최대 무게보다 낮은경우)
            if(weight >= (bridge_weight + trucks.peek())){
                bridge_trucks.add(trucks.peek());
                bridge_weight += trucks.poll();
                // 트럭이 이동완료되는 시간을 계산해 따로 queue로 보관
                truck_time.add(result + bridge_length);
            }
            result++;
        }
        // 마지막에 내리는 트럭 시간 추가
        return result + bridge_length;
    }
}
