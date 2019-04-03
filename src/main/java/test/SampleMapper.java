package test;

import org.mapstruct.Mapper;

@Mapper
public interface SampleMapper extends BaseMapper<SampleDto, Sample> {

	SampleDto map(Sample entity);
    
}
