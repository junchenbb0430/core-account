package com.egf.financial.account.flow;

import org.apache.commons.math3.random.RandomDataGenerator;

public final  class SequenceFlowGenerator {

    private  static final int MIN_VALUE =1;

    private static final int MAX_VALUE = Integer.MAX_VALUE;

    private static final int  RANDOM_DIGITAL_LENGTH= 16;

    private static  final int  CUSTOMER_LENGTH = String.valueOf(MAX_VALUE).length();

    /**
     * 生成客户号
     * @return
     */
    public  static String   generateCustomerId(){
        StringBuilder buffer = new StringBuilder();
        RandomDataGenerator  randomDataGenerator = new RandomDataGenerator();

        String  randomStr = String.valueOf(randomDataGenerator.nextInt(MIN_VALUE,MAX_VALUE));
        int  leftLength = CUSTOMER_LENGTH -randomStr.length();
        for(int i=0;i<leftLength;i++){
                buffer.append(i+1);
        }
        buffer.append(randomStr);

        return buffer.toString();
    }

    public static  String generateFixedLengthDigitalFlow(){
        StringBuilder buffer = new StringBuilder();
        RandomDataGenerator  randomDataGenerator = new RandomDataGenerator();

        String  randomStr = String.valueOf(randomDataGenerator.nextInt(MIN_VALUE,MAX_VALUE));
        int  leftLength = RANDOM_DIGITAL_LENGTH -randomStr.length();
        for(int i=0;i<leftLength;i++){
            buffer.append(i);
        }
        buffer.append(randomStr);

        return buffer.toString();
    }

    public static String generateLengthDigitalFlow(int length){
        StringBuilder buffer = new StringBuilder();
        RandomDataGenerator  randomDataGenerator = new RandomDataGenerator();
        if(length <=10){
            length = 10;
        }
        String  randomStr = String.valueOf(randomDataGenerator.nextInt(MIN_VALUE,MAX_VALUE));
        int  leftLength = length -randomStr.length();
        for(int i=0;i<leftLength;i++){
            buffer.append(i);
        }
        buffer.append(randomStr);

        return buffer.toString();
    }

    public static void main(String[] args){
        System.out.println( 1011732736 %2);
        for(int i=0;i<4;i++){
            System.out.println("生成客户号是 ："+SequenceFlowGenerator.generateCustomerId());
        }
    }

}
