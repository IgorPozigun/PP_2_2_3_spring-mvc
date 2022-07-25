package web.DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
@Component

public class CarsDAOImpl implements CarsDAO {
    private static long CARS_COUNTS = 0L;
    private List<Car> listCars;

    {
        CARS_COUNTS = 0L;
        listCars = new ArrayList<>();
        listCars.add(new Car(++CARS_COUNTS, "CHEVROLET", "CORVETTE ", 1991));
        listCars.add(new Car(++CARS_COUNTS, "AUDI", "Q8", 1992));
        listCars.add(new Car(++CARS_COUNTS, "TOYOTA ", "SUPRA", 2003));
        listCars.add(new Car(++CARS_COUNTS, "KIA", "STINGER", 2004));
        listCars.add(new Car(++CARS_COUNTS, "TESLA", "MODEL", 2015));

    }

    @Override
    public List<Car> listCars() {
        return listCars;
    }

    @Override
    public List<Car> countsCarsId(Integer count) {

         return this.listCars.stream().limit(count).collect(Collectors.toList());

    }

}
