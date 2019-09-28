package blogpost;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blogpost = new ArrayList<>();

    public void AddBlog() {
        for (int i = 0; i < blogpost.size(); i++) {
            blogpost.add(new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04."));
            blogpost.add(new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10."));
        }
    }
}

