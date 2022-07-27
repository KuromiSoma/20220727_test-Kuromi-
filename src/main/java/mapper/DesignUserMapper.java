package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.DesignUser;
import com.example.demo.DesignUserForm;

@Mapper
public interface DesignUserMapper {
	List<DesignUser> selectAll();
}
