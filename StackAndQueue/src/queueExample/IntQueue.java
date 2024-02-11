package queueExample;

public class IntQueue {

    private int[] que; //큐 배열
    private int capacity; //큐 용량

    private int front; //맨 앞의 요소 커서
    private int rear; //맨 뒤의 요소 커서
    private int num; //현재 데이터 개수
    //front와 rear의 값이 같을 때 큐가 비었는지 가득 찼는지 구별할 수 없는 상황을 피하기 위해 사용
    //front == rear 비어있는 상태와 가득 찬 상태 모두를 칭함.
    //따라서 num 변수를 두어 가득 찬 상태와 비어있는 상태를 체크

    //실행 시 예외: 큐가 비어있음
    public class EmptyIntQueueException extends RuntimeException {

        public EmptyIntQueueException() {
        }
    }

    //실행 시 예외: 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {

        public OverflowIntQueueException() {
        }
    }

    //생성자
    public IntQueue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    //큐에 데이터 추가
    public int enque(int x) throws OverflowIntQueueException {
        if (num >= capacity) {
            throw new OverflowIntQueueException(); //큐가 가득 참.
        }
        que[rear++] = x;
        num++;
        if (rear == capacity) {
            rear = 0;
        }
        return x;
    }

    //큐에서 데이터 삭제
    public int deque() throws EmptyIntQueueException {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        int x = que[front++];
        num--;
        if (front == capacity) {
            front = 0;
        }
        return x;
    }

    //큐에서 데이터를 피크
    public int peek() throws EmptyIntQueueException {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

    //큐를 비움
    public void clear() {
        num = front = rear = 0;
    }

    //큐에서 x를 검색하여 인덱스(찾지 못할 때 -1) 을 반환
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x) {
                return idx;
            }
        }
        return -1;
    }
    //인덱스 idx의 계산식: (i + front) % capacity

    //큐의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    //큐에 쌓여있는 데이터 개수를 반환
    public int size() {
        return num;
    }

    //큐가 비었는지 확인
    public boolean isEmpty() {
        return num <= 0;
    }

    //큐가 가득 찼는지 확인
    public boolean isFull() {
        return num >= capacity;
    }

    //큐 안의 모든 데이터를 프린트
    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.println(que[(i + front) % capacity] + " ");
            }
            System.out.println();
        }
    }
}
