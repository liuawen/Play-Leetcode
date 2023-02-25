package cn.liuawen.ch01;

/**
 *
 * 交易类型编码(名称) 主表名称(新的) 子表名称(新的) </br> D0(客户应收单) ar_recbill ar_recitem </br> 23D0(供应商应收单) ar_suprecbill ar_suprecitem </br> 23C0(暂沽应收) ar_estirecbill ar_estirecitem </br> 23B0(暂沽回冲应收)
 * ar_estirecbill(重名) ar_estirecitem(重名) </br> D1(供应商应付单) ap_payablebill ap_payableitem </br> 23D1(客户应付单) ap_cuspayablebill ap_cuspayableitem </br> 23C1(暂估应付) ap_estipayablebill ap_estipayableitem
 * </br> 23B1(暂沽回冲应付) ap_estipayablebill(重名)ap_estipayableitem(重名) </br> D2(客户收款单) ar_gatherbill ar_gatheritem </br> 23D2(供应商收款单) ar_supgatherbill ar_supgatheritem </br> D3(供应商付款单) ap_paybill
 * ap_payitem </br> 23D3(客户付款单) ap_cuspaybill ap_cuspayitem </br>
 */
public class BillEnumCollection {
    /**
     * 节点名称 单据类型 单据名称 借贷方向 借贷数值 </br> 应收管理 F0 应收(客户) （借） 1 </br> F1 应付(供应商) （贷） -1 </br> 应收管理 F2 收款（客户） （贷） -1 </br> F3 付款(供应商) （借） 1 </br> F0S 供应商应收 （借） 1 </br> 应收管理 F1C 客户应付 （贷） -1 </br> F2S 供应商收款单
     * （贷） -1 </br> 应收管理 F3C 客户付款单 （借） 1 </br> 应收管理 E0 暂估应收单 （借） 1 </br> E1 暂估应付单 （贷） -1 </br>
     */
    private BillEnumCollection() {
    };

    /**
     * 方向
     *
     * @author langsc1
     *
     */
    public enum Direction {
        DEBIT(1), /** 借 */
        CREDIT(-1)
        /** 贷 */
        // CHG(3);
        ;

        public final Integer VALUE;

        Direction(int status) {
            VALUE = status;
        }

        public static Direction valueOf(Integer value) {
            Direction ret = null;
            switch (value) {
                case -1:
                    ret = CREDIT;
                    break;
                case 1:
                    ret = DEBIT;
                    break;

                default:
                    break;
            }
            return ret;
        }
    }

    /**
     * 票据方向
     *
     *
     */
    public enum BillDIRECTION {
        DEFAULT("none"), AR("ar"), AP("ap");

        public final String VALUE;

        BillDIRECTION(String status) {
            VALUE = status;
        }

        public String getValue() {
            return VALUE;
        }

        public static BillDIRECTION valueof(String value) {
            BillDIRECTION ret = null;
            if (value.equals(DEFAULT.VALUE))
                ret = DEFAULT;
            else if (value.equals(AR.VALUE))
                ret = AR;
            if (value.equals(AP.VALUE))
                ret = AP;
            return ret;
        }
    }

    /**
     * 支付状态
     *
     *
     */
    public enum PayStatus {
        /** 未处理 */
        DEFAULT(0),
        /**
         * 未支付
         */
        UNPayed(1),
        /**
         * * 支付中
         */
        Paying(2),
        /**
         * 支付完成
         */
        PayFinish(3),
        /**
         * 支付失败
         */
        PayFail(4),

        /**
         * 部分支付完成
         */
        SomePayFinish(20),
        /**
         * 未收款
         */
        UnRecive(5),
        /**
         * 收款中
         */
        Reciving(6),
        /**
         * 收款完成
         */
        ReciveFinish(7),
        /**
         * 收款失败
         */
        ReciveFail(8);
        // DEFAULT(0), SUCESS(1), FAILE(-1), PAYING(2), HAND(3), PARTHAND(4), ACCEPTFAILE(
        // 5), ARAPFAILE(-11), ARAPFING(12), ARAPSUCCED(11);
        public final Integer VALUE;

        PayStatus(int status) {
            VALUE = status;
        }

        public static PayStatus valueof(Integer value) {
            PayStatus ret = null;
            switch (value) {
                case 0:
                    ret = DEFAULT;
                    break;
                case 1:
                    ret = UNPayed;
                    break;
                case 2:
                    ret = Paying;
                    break;
                case 3:
                    ret = PayFinish;
                    break;
                case 4:
                    ret = PayFail;
                    break;
                case 5:
                    ret = UnRecive;
                    break;
                case 6:
                    ret = Reciving;
                    break;
                case 7:
                    ret = ReciveFinish;
                    break;
                case 8:
                    ret = ReciveFail;
                    break;
                case 20:
                    ret = SomePayFinish;
                    break;

                default:
                    break;
            }
            return ret;
        }
    }

    /**
     * 支付方式
     *
     *
     */
    public enum PayWay {
        NONE(0), SETTLE_HAND(3), NETPAY(5), CENTRPAY(10);


        public final Integer VALUE;

        PayWay(int value) {
            VALUE = value;
        }

        public static PayWay valueof(Integer value) {
            PayWay ret = null;
            switch (value) {
                case 0:
                    ret = NONE;
                    break;
                case 3:
                    ret = SETTLE_HAND;
                    break;
                case 5:
                    ret = NETPAY;
                    break;
                case 10:
                    ret = CENTRPAY;
                    break;

                default:
                    break;
            }
            return ret;
        }
    }

    /**
     * 行类型
     */
    public enum RowType {
        FILL(0), NOTFILL(1),SWITCHTO(5),AGENCY(21),LOAN(22),CASH(23),AGENT_BUSINESS(24), SELF_BUSSINESS(25);
        //                                      代理费           代垫                  保证金           代收代付                                    自收自付
        public final Integer VALUE;

        RowType(int value) {
            VALUE = value;
        }

        public static RowType valueof(Integer value) {
            RowType ret = null;
            switch (value) {
                case 0:
                    ret = FILL;
                    break;
                case 1:
                    ret = NOTFILL;
                    break;
                case 5:
                    ret = SWITCHTO;
                    break;
                case 21:
                    ret = AGENCY;
                    break;
                case 22:
                    ret = LOAN;
                    break;
                case 23:
                    ret = CASH;
                    break;
                case 24:
                    ret = AGENT_BUSINESS;
                    break;
                case 25:
                    ret = SELF_BUSSINESS;
                    break;
                default:
                    break;
            }
            return ret;
        }
    }

    /**
     * 结算状态
     */
    public enum SettlementState {
        DEFAULT(0), TRANSSUCCED(1), TRANSFAIL(-1), TRANSING(2) , SomePayFinish(11);
        // 0 默认
        // 1 转账成功
        // -1 转账失败
        // 2 转账中
        // 11 部分
        public final Integer VALUE;

        SettlementState(int value) {
            VALUE = value;
        }

        public static SettlementState valueof(Integer value) {
            SettlementState ret = null;
            switch (value) {
                case 0:
                    ret = DEFAULT;
                    break;
                case 1:
                    ret = TRANSSUCCED;
                    break;
                case -1:
                    ret = TRANSFAIL;
                    break;
                case 2:
                    ret = TRANSING;
                    break;
                case 11:
                    ret = SomePayFinish;
                    break;

                default:
                    break;
            }
            return ret;
        }
    }

    /**
     * 结算类型
     */
    public enum SettlementType {
        NO(0), HAND(3), NETBANK(5), SETTLECENTER(10);

        public final Integer VALUE;

        SettlementType(int value) {
            VALUE = value;
        }

        public static SettlementType valueof(Integer value) {
            SettlementType ret = null;
            switch (value) {
                case 0:
                    ret = NO;
                    break;
                case 3:
                    ret = HAND;
                    break;
                case 5:
                    ret = NETBANK;
                    break;
                case 10:
                    ret = SETTLECENTER;
                    break;

                default:
                    break;
            }
            return ret;
        }
    }

    /**
     * 单据来源系统
     */
    public enum FromSystem {
        AR(0), // 应收系统
        AP(1), // 应付系统
        CMP(2), // 现金管理
        SO(3), // 销售系统
        PO(4), // 采购系统
        FTS(5), // 资金结算
        NET(6), // 网上银行----dap_dapsystem中没有记录,
        CFBM(8), // 集中票据管理
        XTDJ(9), // 协同单据----dap_dapsystem中没有记录
        CDMA(10), // 银行信贷管理
        XBGL(12), // 项目管理----dap_dapsystem中没有记录
        TB(13), // 全面预算
        TO(16), // 内部交易
        WBJHPT(17), // 外部交换平台----dap_dapsystem中没有记录
        ZJJX(18), // 资金计息----dap_dapsystem中没有记录
        IC(19), // 库存管理
        CT(20), // 合同管理
        YS(24), // 运输----dap_dapsystem中没有记录
        PS(7), // 付款排程
        AM(104), // 资产管理
        WSBX(105),// 费用管理（网上报销）----dap_dapsystem中没有记录
        CR09(109),
        JCK(113),
        CRM(114),
        XYZ(115);
        // Lease(6);

        public final Integer VALUE;

        FromSystem(int value) {
            VALUE = value;
        }

        public static FromSystem valueof(Integer value) {
            FromSystem ret = null;
            switch (value) {
                case 0:
                    ret = AR;
                    break;
                case 1:
                    ret = AP;
                    break;
                case 2:
                    ret = CMP;
                    break;
                case 3:
                    ret = SO;
                    break;
                case 4:
                    ret = PO;
                    break;
                case 5:
                    ret = FTS;
                    break;
                case 6:
                    ret = NET;
                    break;
                case 8:
                    ret = CFBM;
                    break;
                case 9:
                    ret = XTDJ;
                    break;
                case 10:
                    ret = CDMA;
                    break;
                case 12:
                    ret = XBGL;
                    break;
                case 13:
                    ret = TB;
                    break;
                case 16:
                    ret = TO;
                    break;
                case 17:
                    ret = WBJHPT;
                    break;
                case 18:
                    ret = ZJJX;
                    break;
                case 19:
                    ret = IC;
                    break;
                case 20:
                    ret = CT;
                    break;
                case 24:
                    ret = YS;
                    break;
                case 104:
                    ret = AM;
                    break;
                case 105:
                    ret = WSBX;
                    break;
                default:
                    break;
            }
            return ret;
        }
    }

    /**
     * 单据来源系统
     */
    public enum BillType {
        PURCHASE_ORDER("21"), // 采购合同
        PS_APPLY("36D1"), // 付款申请
        PS_PLANDETAIL("36D7"), // 付款排程
        SALES_ORDER("30"); // 销售订单
        public final String VALUE;

        BillType(String value) {
            VALUE = value;
        }
    }

    /**
     * 生效标志
     */
    public enum InureSign {
        /** 未生效 */
        NOINURE(0),
        /** 未生成凭证 */
        NOVOUCHER(5),
        /** 已生效 */
        OKINURE(10);

        public final Integer VALUE;

        InureSign(int value) {
            VALUE = value;
        }

        public static InureSign valueof(Integer value) {
            InureSign ret = null;
            if(null == value){
                ret = NOINURE;
                return ret;
            }
            switch (value) {
                case 0:
                    ret = NOINURE;
                    break;
                case 5:
                    ret = NOVOUCHER;
                    break;
                case 10:
                    ret = OKINURE;
                    break;
                default:
                    ret = NOINURE;
                    break;
            }
            return ret;
        }
    }

    /**
     * 往来对象
     */
    public enum ObjType {
        CUSTOMER(0), PERSON(3), DEP(2), SUPPLIER(1),CUSSUP(8);

        public final Integer VALUE;

        ObjType(int value) {
            VALUE = value;
        }

        public static ObjType valueof(Integer value) {
            ObjType ret = null;
            switch (value) {
                case 0:
                    ret = CUSTOMER;
                    break;
                case 1:
                    ret = SUPPLIER;
                    break;
                case 2:
                    ret = DEP;
                    break;
                case 3:
                    ret = PERSON;
                    break;
                default:
                    break;
            }
            return ret;
        }
    }

    /**
     * 审核状态
     */
    public enum CheckState {
        CHECKING(0), CHECKOK(1), CHECKNO(2), /*RETURN(3), cloud移除驳回态*/
        FREE(-1) /*cloud新增加自由态*/, SUBMIT(3)/*cloud新增加提交态*/;

        public final Integer VALUE;

        CheckState(int value) {
            VALUE = value;
        }

        public static CheckState valueof(Integer value) {
            CheckState ret = null;
            switch (value) {
                case -1:
                    ret = FREE;
                    break;
                case 0:
                    ret = CHECKING;
                    break;
                case 1:
                    ret = CHECKOK;
                    break;
                case 2:
                    ret = CHECKNO;
                    break;
                case 3:
                    ret = SUBMIT;
                    break;
                default:
                    break;
            }
            return ret;
        }
    }

    /**
     * 扣税类别
     */
    public enum TaxType {
        TAXIN(0), TAXOUT(1), NOTAX(2);

        public final Integer VALUE;

        TaxType(int value) {
            VALUE = value;
        }

        public static TaxType valueof(Integer value) {
            TaxType ret = null;
            switch (value) {
                case 0:
                    ret = TAXIN;
                    break;
                case 1:
                    ret = TAXOUT;
                    break;
                case 2:
                    ret = NOTAX;
                    break;
                default:
                    break;
            }
            return ret;
        }
    }

    /**
     * 单据协同标志
     */
    public enum BillCooperate {
        NOSUER(0), SURE(1);

        public final Integer VALUE;

        BillCooperate(int value) {
            VALUE = value;
        }

        public static BillCooperate valueof(Integer value) {
            BillCooperate ret = null;
            switch (value) {
                case 0:
                    ret = NOSUER;
                    break;
                case 1:
                    ret = SURE;
                    break;
                default:
                    break;
            }
            return ret;
        }
    }

    /**
     * 并账类别
     */
    public enum Account {
        IN(0), OUT(1);

        public final Integer VALUE;

        Account(int value) {
            VALUE = value;
        }

        public static Account valueof(Integer value) {
            Account ret = null;
            switch (value) {
                case 0:
                    ret = IN;
                    break;
                case 1:
                    ret = OUT;
                    break;
                default:
                    break;
            }
            return ret;
        }
    }

    public enum BillSatus {
        /** 暂存状态 */
        Tempeorary(-99),
        /** 保存状态 */
        Save(-1),
        /** 已审核 */
        Audit(1),
        /** 删除 */
        Deleted(4),
        /** 挂起 */
        HangUp(6),
        /** 签字状态 */
        Sign(8), UnComfirm(9), Closing(10);
        public final Integer VALUE;

        BillSatus(int value) {
            VALUE = value;
        }

        public static BillSatus valueof(int value) {
            BillSatus ret = null;
            switch (value) {
                case -99:
                    ret = Tempeorary;
                    break;
                case -1:
                    ret = Save;
                    break;
                case 1:
                    ret = Audit;
                    break;
                case 4:
                    ret = Deleted;
                    break;
                case 6:
                    ret = HangUp;
                    break;
                case 8:
                    ret = Sign;
                    break;
                case 9:
                    ret = UnComfirm;
                    break;
                case 10:
                    ret = Closing;
                    break;
                default:
                    ret = Save;
                    break;
            }
            return ret;
        }
    }

	/*
public static BillSatus valueof(int value) {
			BillSatus ret = null;
			switch (value) {
				case -99:
					ret = Tempeorary;
					break;
				case -1:
					ret = Save;
					break;
				case 1:
					ret = Audit;
					break;
				case 2:
					ret = AuditHandling;
					break;
				case 3:
					ret = AuditHandlFail;
					break;
				case 4:
					ret = Deleted;
					break;
				case 6:
					ret = HangUp;
					break;
				case 8:
					ret = Sign;
					break;
				case 9:
					ret = UnComfirm;
					break;
				case 10:
					ret = Closing;
					break;
				default:
					ret = Save;
					break;
			}
			return ret;
		}
	}
	 */

    public enum ApproveStatus {
        /** 自由 */
        NOSTATE(-1),
        /** 审批不通过 */
        NOPASS(0),
        /** 审批通过 */
        PASSING(1),
        /** 审批中 */
        GOINGON(2),
        /** 已提交 */
        COMMIT(3);
        public final Integer VALUE;

        ApproveStatus(int value) {
            VALUE = value;
        }

        public static ApproveStatus valueof(int value) {
            ApproveStatus ret = null;
            switch (value) {
                case -1:
                    ret = NOSTATE;
                    break;
                case 0:
                    ret = NOPASS;
                    break;
                case 1:
                    ret = PASSING;
                    break;
                case 2:
                    ret = GOINGON;
                    break;
                case 3:
                    ret = COMMIT;
                    break;

                default:
                    ret = NOSTATE;
                    break;
            }
            return ret;
        }
    }

//	/**
//	 * 付款性质 - 改成 预收 / 预付标志
//	 *
//	 */
//	public enum PreSign {
//		/** 预收标志 */
//		PreRec(1),
//
//		/** 预付标志 */
//		prePay(-1);
//		public final Integer VALUE;
//
//		PreSign(int value) {
//			VALUE = value;
//		}
//
//		public PreSign valueof(int value) {
//			PreSign ret = null;
//			switch (value) {
//			case 1:
//				ret = PreSign.PreRec;
//				break;
//			case -1:
//				ret = PreSign.prePay;
//				break;
//			default:
//				break;
//			}
//			return ret;
//		}
//	}

    /**
     * 付款性质 - 改成 预收 / 预付标志
     *
     */
    public enum PreSigns {
        /** 应收款/应付款 */
        notPre(0),

        /** 预收款、预付款 */
        isPre(1);
        public final Integer VALUE;

        PreSigns(int value) {
            VALUE = value;
        }

        public PreSigns valueof(int value) {
            PreSigns ret = null;
            switch (value) {
                case 0:
                    ret = PreSigns.notPre;
                    break;
                case 1:
                    ret = PreSigns.isPre;
                    break;
                default:
                    break;
            }
            return ret;
        }
    }

    /**
     * 催款语气类别
     */
    public enum NoticeType {
        ZL(1), YE(2);

        public final Integer VALUE;

        NoticeType(int value) {
            VALUE = value;
        }

        public static NoticeType valueof(Integer value) {
            NoticeType ret = null;
            switch (value) {
                case 1:
                    ret = ZL;
                    break;
                case 2:
                    ret = YE;
                    break;
                default:
                    break;
            }
            return ret;
        }
    }

    /**
     * 暂估 回冲标志
     *
     * @author miaohl
     *
     */
    public enum EstiType {
        ESTQR(0), // 暂估确认
        EST(1), // 暂估
        NOTEST(2); // 暂估回冲

        public final Integer VALUE;

        EstiType(int value) {
            VALUE = value;
        }

        public static EstiType valueof(Integer value) {
            EstiType ret = null;
            switch (value) {
                case 0:
                    ret = ESTQR;
                    break;
                case 1:
                    ret = EST;
                    break;
                case 2:
                    ret = NOTEST;
                    break;
                default:
                    break;
            }
            return ret;
        }
    }

    public enum CommissionPayStatus {
        // 待承付
        UnCommissionPay(0),
        // 承付中
        CommissionPaying(1),
        // 已承付
        CommissionPaySusscess(2);

        public final Integer VALUE;

        CommissionPayStatus(int status) {
            VALUE = status;
        }
    }

    public enum CommissionPayType {
        // 全额承付
        CommPayALL(0),
        // 全额拒付
        RefuseCommPay(1),
        // 部分承付
        CommPayPartly(2),
        // 强制全额承付
        ForceCommPayALL(3);

        public final Integer VALUE;

        CommissionPayType(int status) {
            VALUE = status;
        }
    }

    public enum BuySellType {
        // 国内销售
        IN_SELL(1),
        // 国内采购
        IN_BUY(2),
        // 出口销售
        OUT_SELL(3),
        // 进口采购
        OUT_BUY(4),
        // 不区分
        DEFAULT_TYPE(5);

        public final Integer VALUE;

        BuySellType(int status) {
            VALUE = status;
        }
    }

    public enum VoucherStatus {
        // 未生成凭证=1,已生成凭证=2,凭证已记账=3
        VOUCHER_NOT_GENERATE("1"),VOUCHER_GENERATED("2"),ACCOUNTING_VOUCHER("3");

        public final String VALUE;

        VoucherStatus(String status) {
            VALUE = status;
        }
    }
    public enum VerifyStatus {
        // 未核销=1,已核销=2,部分核销=3
        NOT_VERIFY("1"),VERIFIED("2"),PART_VERIFIED("3");

        public final String VALUE;

        VerifyStatus(String status) {
            VALUE = status;
        }
    }

    // /**
    // * 单据大类
    // *
    // */
    // public enum BillClass {
    // /** 应收 */
    // YS("ys"),
    // /** 应付 */
    // YF("yf"),
    // /** 收款 */
    // SK("sk"),
    // /** 付款 */
    // FK("fk"),
    // /** 暂估应收 */
    // ZS("zs"),
    // /** 暂估应付 */
    // ZF("zf");
    // public final String VALUE;
    //
    // BillClass(String value) {
    // VALUE = value;
    // }
    // }

}
