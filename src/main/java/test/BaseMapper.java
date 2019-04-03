package test;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

public interface BaseMapper<T,U> {

	T map(U entity);

    List<T> map(List<U> entities);

    default public Page<T> map(Page<U> pageable) {
		List<T> content = this.map(pageable.getContent());
		Page<T> result = new PageImpl<T>(content, pageable.getPageable(), pageable.getTotalElements());
		return result;
    };

}
