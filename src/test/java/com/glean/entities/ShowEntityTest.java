package com.glean.entities;

import com.glean.services.ShowRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by justi on 12/19/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowEntityTest {

    @Autowired
    ShowRepo showRepo;

    @Test
    public void setsIdOnSave() {

        List<Show> shows = showRepo.findByTitle("Archer");
        for(Show show: shows){
            System.out.println(show.getTitle());
        }

    }

}
