package vn.myclass.core.service;

import org.hibernate.exception.ConstraintViolationException;
import vn.myclass.core.dto.ExaminationDTO;
import vn.myclass.core.dto.ListenGuidelineDTO;

import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 24/11/2017.
 */
public interface ExaminationService {
    List<ExaminationDTO> findAll();
    Object[] findExaminationByProperties(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit);
    ExaminationDTO findById(String property, Integer listenGuideLineId);
    void save(ExaminationDTO dto) throws ConstraintViolationException;
    ExaminationDTO update(ExaminationDTO dto);
    void delete(Integer id);
}
