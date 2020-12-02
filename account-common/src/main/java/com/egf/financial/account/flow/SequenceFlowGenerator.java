package com.egf.financial.account.flow;

import org.apache.commons.math3.random.RandomDataGenerator;

public final  class SequenceFlowGenerator {

    private  static final int min =1;

    private static final int max = Integer.MAX_VALUE;

    private static final int  RANDOM_DIGITAL_LENGTH= 16;

    /**
     * 生成客户号
     * @return
     */
    public  static String   generateCustomerId(){
        StringBuilder buffer = new StringBuilder();
        RandomDataGenerator  randomDataGenerator = new RandomDataGenerator();

        String  randomStr = String.valueOf(randomDataGenerator.nextInt(min,max));
        int  leftLength = RANDOM_DIGITAL_LENGTH -randomStr.length();
        for(int i=0;i<leftLength;i++){
                buffer.append(i);
        }
        buffer.append(randomStr);

        return buffer.toString();
    }

    public static  String generateFixedLengthDigitalFlow(){
        StringBuilder buffer = new StringBuilder();
        RandomDataGenerator  randomDataGenerator = new RandomDataGenerator();

        String  randomStr = String.valueOf(randomDataGenerator.nextInt(min,max));
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
        String  randomStr = String.valueOf(randomDataGenerator.nextInt(min,max));
        int  leftLength = length -randomStr.length();
        for(int i=0;i<leftLength;i++){
            buffer.append(i);
        }
        buffer.append(randomStr);

        return buffer.toString();
    }


}
