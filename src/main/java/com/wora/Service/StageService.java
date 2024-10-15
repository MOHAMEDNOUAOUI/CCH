package com.wora.Service;

import com.wora.Entity.Stage;

import java.util.List;
import java.util.Optional;

public interface StageService {
    Optional<Stage> findStageById(Long id);
    Optional<Stage> findStageByName(String name);
    Optional<Stage> saveStage(Stage stage);
    List<Stage> findAllStages();
    void deleteStage(Stage stage);
    Optional<Stage> updateStage(Stage stage);

}
