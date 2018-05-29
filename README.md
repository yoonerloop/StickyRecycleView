# StickyRecycleView
RecycleView的ItemDecoration实现分割线、分组、粘性布局

## ItemDecoration类主要包含三个方法：

    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, State state)
    public void onDraw(Canvas c, RecyclerView parent, State state)
    public void onDrawOver(Canvas c, RecyclerView parent, State state)

方法一：可以实现类似padding的效果。<br/>

方法二：可以实现类似绘制背景的效果，内容在底部。<br/>

方法三：可以绘制在内容的上面，覆盖内容。<br/>

下面的分割线、分组、粘性布局就基于此实现：
  
    
![添加图片描述](https://github.com/yoonerloop/StickyRecycleView/blob/master/picture/picture_divider.png)
![添加图片描述](https://github.com/yoonerloop/StickyRecycleView/blob/master/picture/picture_section.gif)
![添加图片描述](https://github.com/yoonerloop/StickyRecycleView/blob/master/picture/picture_sticky.gif)
