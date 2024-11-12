package com.yupi.yangojcodesandbox;


import com.yupi.yangojcodesandbox.model.ExecuteCodeRequest;
import com.yupi.yangojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
