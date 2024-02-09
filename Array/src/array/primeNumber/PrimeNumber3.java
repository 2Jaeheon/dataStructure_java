package array.primeNumber;

public class PrimeNumber3 {

    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0; // 찾은 소수의 개수
        int[] prime = new int[500]; //소수를 저장하는 배열

        prime[ptr++] = 2; //2는 소수
        prime[ptr++] = 3; //3은 소수

        for (int n = 5; n <= 1000; n += 2) { //조사대상은 홀수
            boolean flag = false;

            //prime[i]의 n의 제곱근 이하인지를 판단해야함.
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2; //counter를 2씩 증가시키는 이유는 prime[i]*prime[i] 과 n % prime[i]를 계산하기 위함임

                if (n % prime[i] == 0) { //나누어 떨어지면 소수가 아님
                    flag = true;
                    break;
                }
            }

            //n이 소수인 경우
            if (!flag) { //flag가 거짓일 때 즉 마지막까지 나누어 떨어지지 않을 때
                prime[ptr++] = n; //소수로 배열에 저장
                counter++;
            }
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("곱셈과 나눗셈을 수행한 횟수: " + counter);
    }
}
