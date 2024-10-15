package com.wora.Service.impl;

import com.wora.DAO.StageDAO;
import com.wora.Entity.Stage;
import com.wora.Service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StageServiceimpl implements StageService {

    private final StageDAO stageDAO;

    @Autowired
    public StageServiceimpl(StageDAO stageDAO) {
        this.stageDAO = stageDAO;
    }


    @Override
    public Optional<Stage> findStageById(Long id) {
        return stageDAO.findById(id);
    }

    @Override
    public Optional<Stage> findStageByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<Stage> saveStage(Stage stage) {
        return stageDAO.save(stage);
    }

    @Override
    public List<Stage> findAllStages() {
        return stageDAO.findAll();
    }

    @Override
    public void deleteStage(Stage stage) {
        stageDAO.delete(stage);
    }

    @Override
    public Optional<Stage> updateStage(Stage stage) {
        return stageDAO.update(stage);
    }
}
