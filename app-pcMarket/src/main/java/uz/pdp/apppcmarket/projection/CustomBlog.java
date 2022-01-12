package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Blog;

@Projection(types = Blog.class)
public interface CustomBlog {

    Integer getId();

    Integer getProduct_id();
}
