package algorithms.timecomplexity;

import java.util.Scanner;

public class Q10158 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  가로길이, 세로길이 입력받기
        int w = scan.nextInt();
        int h = scan.nextInt();
        //  개미의 현재 x, y좌표 입력받기
        int p = scan.nextInt();
        int q = scan.nextInt();
        //  계산할 시간 입력받기
        int t = scan.nextInt();

        solve01(w, h, p, q, t);
    }

    public static void patternChecker(int w, int h, int x, int y, int t){
        int velX = 1;
        int velY = 1;

        int timeX = t%(2*w);
        int timeY = t%(2*h);

        while(timeX-- > 0){
            if(x == w) velX = -1;
            else if(x == 0) velX = 1;
            x += velX;
        }

        while(timeY-- > 0){
            if(y == h) velY = -1;
            else if(y == 0) velY = 1;
            y += velY;
        }

    }

    //  1. 단순 문제풀이, 시간 초과오류 반환
    public static void solve01(int w, int h, int p, int q, int t) {
        int deltaX = 1;
        int deltaY = 1;

        while (t-- > 0){
            if(p == w) deltaX = -1;
            else if (p == 0) deltaX = 1;
            if(q == h) deltaY = -1;
            else if (q == 0) deltaY = 1;
            p += deltaX;
            q += deltaY;
        }
        System.out.println(p + " " + q);
    }

    //  2. 패턴을 분석해 시간복잡도를 개선한 풀이방법
    public void solve02(int w, int h, int p, int q, int t){
        int timeX = t%(2*w);
        int currentX = p;
        int velX = 1;
        while(timeX-- > 0){
            if(currentX == w) velX = -1;
            else if(currentX == 0) velX = 1;
            currentX += velX;
        }

        int timeY = t%(2*h);
        int currentY = q;
        int velY = t%(2*h);
        while(timeY-- > 0){
            if(currentY == w) velY = -1;
            else if(currentY == 0) velY = 1;
            currentY += velY;
        }

        System.out.println(currentX + " " + currentY);
    }

    //  3. 시간복잡도를 O(1)로 줄인 풀이방법
    public void solve03(int w, int h, int p, int q, int t){
        int currentX = (t + p) % (2 * w);
        int currentY = (t + q) % (2 * h);
        if(currentX > w) currentX = 2 * w - currentX;
        if(currentY > h) currentY = 2 * h - currentY;

        System.out.println(currentX + " " + currentY);
    }
}
