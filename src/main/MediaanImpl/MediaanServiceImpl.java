package main.MediaanImpl;

import javax.jws.WebService;
import java.math.BigInteger;
import main.resources.ObjectFactory;
import main.resources.Result;
import main.resources.Nummers;
import main.resources.MediaanServiceInterface;
import javax.jws.WebService;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import static java.lang.Math.round;

/**
 * Created by Fahim on 9-3-2017.
 */

    @WebService( endpointInterface= "main.resources.MediaanServiceInterface")
    public class MediaanServiceImpl implements MediaanServiceInterface {

        @Override
        public Result calculateMediaan(Nummers nummers){
            double mediaan;

            List<BigInteger> nums =  new ArrayList<BigInteger>();
            int half = 1;
            nums = nummers.getNummer();
            int size =nums.size();
            Collections.sort(nums);

            if(size == 1){
                mediaan = nums.get(0).intValue();
            }
            else if ((size%2) == 0) {
                half = round(size / 2);
                mediaan = (nums.get(half).intValue() + nums.get(half - 1).intValue()) / 2;
            }
            else {
                half = round(size / 2);
                mediaan = nums.get(half).intValue();
            }
            System.out.println(nums);
            System.out.println("Size " + size);
            System.out.println("Half " + half);
//          System.out.println(nums.get(half).intValue());
            System.out.println("Mediaan " + mediaan);

            ObjectFactory factory = new ObjectFactory();
            Result response = factory.createResult();
            response.setMediaan(new java.math.BigDecimal(Double.valueOf(mediaan)));
            return response;
        }
}
