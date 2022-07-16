package com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter a length of side 'a': ");
        float sideA = Float.parseFloat(br.readLine());
        System.out.print("Please enter a length of side 'b': ");
        float sideB = Float.parseFloat(br.readLine());
        System.out.print("Please enter a length of side 'c': ");
        float sideC = Float.parseFloat(br.readLine());
        float sideG = (float) Math.sqrt(sideA * sideA + sideB * sideB);
        float sideF = (float) Math.sqrt(sideG * sideG + sideC * sideC);
        System.out.printf("Please enter a length of side 'd' (no more than %f): ", sideF);
        float sideD = Float.parseFloat(br.readLine());
        System.out.printf("Please enter a length of side 'e' (between %f and %f): ", sideF - sideD, sideF);
        float sideE = Float.parseFloat(br.readLine());

        float sqrTriangleABG = sideA * sideB / 2;
        float sqrTriangleCFG = sideC * sideG / 2;
        float semiperim = (sideD + sideE + sideF) / 2;
        float sqrTriangleDEF = (float) Math.sqrt(semiperim * (semiperim - sideD) *
                (semiperim - sideE) * (semiperim - sideF));
        float sqrPentagon = sqrTriangleABG + sqrTriangleCFG + sqrTriangleDEF;

        System.out.println("=== RESULTS ===");
        System.out.println("The square of ABG triangle: " + sqrTriangleABG);
        System.out.println("The square of CFG triangle: " + sqrTriangleCFG);
        System.out.println("The square of DEF triangle: " + sqrTriangleDEF);
        System.out.println("The square of the pentagon: " + sqrPentagon);
    }
}
