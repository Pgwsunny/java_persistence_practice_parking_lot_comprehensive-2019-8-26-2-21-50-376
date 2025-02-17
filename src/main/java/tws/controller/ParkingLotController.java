package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.ParkingLot;
import tws.repository.ParkingLotMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/parkinglot")
public class ParkingLotController {

    @Autowired
    private ParkingLotMapper parkingLotMapper;

    @GetMapping("")
    public ResponseEntity<List<ParkingLot>> getAll() {
        return ResponseEntity.ok(parkingLotMapper.selectAll());
    }

    @PostMapping("")
    public ResponseEntity<ParkingLot> insert(@RequestBody ParkingLot parkingLot) {
    	parkingLotMapper.insert(parkingLot);
        return ResponseEntity.created(URI.create("/parkingLot/" + parkingLot.getParkingLotID())).body(parkingLot);
    }
}
