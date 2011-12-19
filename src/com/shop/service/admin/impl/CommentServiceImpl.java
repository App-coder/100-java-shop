package com.shop.service.admin.impl;

import com.shop.mapper.CommentMapper;
import com.shop.model.ShopComment;
import com.shop.service.admin.CommentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import java.util.List;
@Service("commentService")
public class CommentServiceImpl implements CommentService {

    private CommentMapper commentMapper;
    @Resource(name="commentMapper")
    public void setCommentMapper(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    public int getTotalFilter(String username, String goodsname,
			String starttime, String endtime) {
		return this.commentMapper.getTotalFilter(username,goodsname,starttime,endtime);
	}

	public List<ShopComment> loadFilter(int page, int rows, String username,
			String goodsname, String starttime, String endtime) {
		int start = (page-1)*rows;
		return this.commentMapper.loadFilter(start,rows,username,goodsname,starttime,endtime);
	}

	public List<ShopComment> loadByUsername(int page, int rows, String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getTotalByUsername(String keywords) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getTotalByGoodsname(String keywords) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ShopComment> loadByGoodsname(int page, int rows, String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteById(int ids) {
		// TODO Auto-generated method stub
		return 0;
	}

    public int getCount(int status) {
        return this.commentMapper.getCount(status);
    }

}
