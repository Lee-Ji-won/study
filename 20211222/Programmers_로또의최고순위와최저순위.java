package temp;
import java.util.*;

public class Programmers_로또의최고순위와최저순위 {

	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = {};
	        Arrays.sort(lottos);
	        Arrays.sort(win_nums);

	        int max = 0;
	        int min = 0;
	        int zero = 0;
	        boolean[] check = new boolean[6];
	        for(int i = 0; i < 6; i++){
	            if(lottos[i] == 0){
	                zero++;
	            }
	            for(int j = 0; j < 6; j++){
	                if(lottos[i] == win_nums[j]){
	                    max++;
	                    check[j] = true;
	                    break;
	                }
	            }
	        }
	        min = max;
	        for(int i = 0; i < 6; i++){
	            if(lottos[i] == 0){
	                for(int j = 0; j < 6; j++){
	                    if(!check[j]){
	                        check[j] = true;
	                        max++;
	                        break;
	                    }
	                }
	            }
	        }
	        
	        answer = new int[2];
	        answer[0] = max;
	        answer[1] = min;
	        for(int i = 0; i < answer.length; i++){
	            if(answer[i] == 6){
	                answer[i] = 1;
	            } else if(answer[i] == 5){
	                answer[i] = 2;
	            } else if(answer[i] == 4){
	                answer[i] = 3;
	            } else if(answer[i] == 3){
	                answer[i] = 4;
	            } else if(answer[i] == 2){
	                answer[i] = 5;
	            } else {
	                answer[i] = 6;
	            }
	        }
	        
	        return answer;
	    }
	}
}
