package bg.com.bo.demoBG.domain;

import java.util.ArrayList;
import java.util.List;

public class AchCamarasExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	public AchCamarasExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andCodigoIsNull() {
			addCriterion("CODIGO is null");
			return (Criteria) this;
		}

		public Criteria andCodigoIsNotNull() {
			addCriterion("CODIGO is not null");
			return (Criteria) this;
		}

		public Criteria andCodigoEqualTo(Integer value) {
			addCriterion("CODIGO =", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoNotEqualTo(Integer value) {
			addCriterion("CODIGO <>", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoGreaterThan(Integer value) {
			addCriterion("CODIGO >", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoGreaterThanOrEqualTo(Integer value) {
			addCriterion("CODIGO >=", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoLessThan(Integer value) {
			addCriterion("CODIGO <", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoLessThanOrEqualTo(Integer value) {
			addCriterion("CODIGO <=", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoIn(List<Integer> values) {
			addCriterion("CODIGO in", values, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoNotIn(List<Integer> values) {
			addCriterion("CODIGO not in", values, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoBetween(Integer value1, Integer value2) {
			addCriterion("CODIGO between", value1, value2, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoNotBetween(Integer value1, Integer value2) {
			addCriterion("CODIGO not between", value1, value2, "codigo");
			return (Criteria) this;
		}

		public Criteria andDescripcionIsNull() {
			addCriterion("DESCRIPCION is null");
			return (Criteria) this;
		}

		public Criteria andDescripcionIsNotNull() {
			addCriterion("DESCRIPCION is not null");
			return (Criteria) this;
		}

		public Criteria andDescripcionEqualTo(String value) {
			addCriterion("DESCRIPCION =", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionNotEqualTo(String value) {
			addCriterion("DESCRIPCION <>", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionGreaterThan(String value) {
			addCriterion("DESCRIPCION >", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
			addCriterion("DESCRIPCION >=", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionLessThan(String value) {
			addCriterion("DESCRIPCION <", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionLessThanOrEqualTo(String value) {
			addCriterion("DESCRIPCION <=", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionLike(String value) {
			addCriterion("DESCRIPCION like", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionNotLike(String value) {
			addCriterion("DESCRIPCION not like", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionIn(List<String> values) {
			addCriterion("DESCRIPCION in", values, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionNotIn(List<String> values) {
			addCriterion("DESCRIPCION not in", values, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionBetween(String value1, String value2) {
			addCriterion("DESCRIPCION between", value1, value2, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionNotBetween(String value1, String value2) {
			addCriterion("DESCRIPCION not between", value1, value2, "descripcion");
			return (Criteria) this;
		}

		public Criteria andTz_lockIsNull() {
			addCriterion("TZ_LOCK is null");
			return (Criteria) this;
		}

		public Criteria andTz_lockIsNotNull() {
			addCriterion("TZ_LOCK is not null");
			return (Criteria) this;
		}

		public Criteria andTz_lockEqualTo(Integer value) {
			addCriterion("TZ_LOCK =", value, "tz_lock");
			return (Criteria) this;
		}

		public Criteria andTz_lockNotEqualTo(Integer value) {
			addCriterion("TZ_LOCK <>", value, "tz_lock");
			return (Criteria) this;
		}

		public Criteria andTz_lockGreaterThan(Integer value) {
			addCriterion("TZ_LOCK >", value, "tz_lock");
			return (Criteria) this;
		}

		public Criteria andTz_lockGreaterThanOrEqualTo(Integer value) {
			addCriterion("TZ_LOCK >=", value, "tz_lock");
			return (Criteria) this;
		}

		public Criteria andTz_lockLessThan(Integer value) {
			addCriterion("TZ_LOCK <", value, "tz_lock");
			return (Criteria) this;
		}

		public Criteria andTz_lockLessThanOrEqualTo(Integer value) {
			addCriterion("TZ_LOCK <=", value, "tz_lock");
			return (Criteria) this;
		}

		public Criteria andTz_lockIn(List<Integer> values) {
			addCriterion("TZ_LOCK in", values, "tz_lock");
			return (Criteria) this;
		}

		public Criteria andTz_lockNotIn(List<Integer> values) {
			addCriterion("TZ_LOCK not in", values, "tz_lock");
			return (Criteria) this;
		}

		public Criteria andTz_lockBetween(Integer value1, Integer value2) {
			addCriterion("TZ_LOCK between", value1, value2, "tz_lock");
			return (Criteria) this;
		}

		public Criteria andTz_lockNotBetween(Integer value1, Integer value2) {
			addCriterion("TZ_LOCK not between", value1, value2, "tz_lock");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table GANADERO.ACH_CAMARAS
	 * @mbg.generated
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table GANADERO.ACH_CAMARAS
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}