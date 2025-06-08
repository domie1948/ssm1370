import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yuangong from '@/views/modules/yuangong/list'
    import yuangonggongzi from '@/views/modules/yuangonggongzi/list'
    import tongzhigonggao from '@/views/modules/tongzhigonggao/list'
    import yuangongliuyan from '@/views/modules/yuangongliuyan/list'
    import bumenjingli from '@/views/modules/bumenjingli/list'
    import shenpiliucheng from '@/views/modules/shenpiliucheng/list'
    import lizhishenqing from '@/views/modules/lizhishenqing/list'
    import users from '@/views/modules/users/list'
    import zongjingli from '@/views/modules/zongjingli/list'
    import neibuyoujian from '@/views/modules/neibuyoujian/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
          ,{
	path: '/yuangonggongzi',
        name: '员工工资',
        component: yuangonggongzi
      }
          ,{
	path: '/tongzhigonggao',
        name: '通知公告',
        component: tongzhigonggao
      }
          ,{
	path: '/yuangongliuyan',
        name: '员工留言',
        component: yuangongliuyan
      }
          ,{
	path: '/bumenjingli',
        name: '部门经理',
        component: bumenjingli
      }
          ,{
	path: '/shenpiliucheng',
        name: '审批流程',
        component: shenpiliucheng
      }
          ,{
	path: '/lizhishenqing',
        name: '离职申请',
        component: lizhishenqing
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/zongjingli',
        name: '总经理',
        component: zongjingli
      }
          ,{
	path: '/neibuyoujian',
        name: '内部邮件',
        component: neibuyoujian
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
