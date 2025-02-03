package com.usenol.services.impl;

import com.usenol.dto.DTOHome;
import com.usenol.dto.DTORoom;
import com.usenol.entities.Home;
import com.usenol.entities.Room;
import com.usenol.repository.HomeRepository;
import com.usenol.services.IHomeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;

@Service
public class HomeServiceImpl implements IHomeService {

    @Autowired
    public HomeRepository homeRepository;

    public DTOHome findHomeById(Long id) {
        DTOHome dtoHome = new DTOHome();
        Optional<Home> optional = homeRepository.findById(id);

        if (optional.isEmpty()) { return null; }

        Home dbHome = optional.get();
        BeanUtils.copyProperties(dbHome, dtoHome);

        List<Room> dbRooms = optional.get().getRoom();

        if (dbRooms != null && !dbRooms.isEmpty()) {
            for (Room dbRoom : dbRooms) {
                DTORoom dtoRoom = new DTORoom();
                BeanUtils.copyProperties(dbRoom, dtoRoom);
                dtoHome.getRooms().add(dtoRoom);
            }
        }
        return dtoHome;
    }
}
