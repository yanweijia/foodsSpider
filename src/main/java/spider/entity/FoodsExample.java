package spider.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public FoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andFoodIdIsNull() {
            addCriterion("food_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNotNull() {
            addCriterion("food_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIdEqualTo(Integer value) {
            addCriterion("food_id =", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotEqualTo(Integer value) {
            addCriterion("food_id <>", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThan(Integer value) {
            addCriterion("food_id >", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_id >=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThan(Integer value) {
            addCriterion("food_id <", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("food_id <=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdIn(List<Integer> values) {
            addCriterion("food_id in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotIn(List<Integer> values) {
            addCriterion("food_id not in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdBetween(Integer value1, Integer value2) {
            addCriterion("food_id between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("food_id not between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Integer value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Integer value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Integer value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Integer value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Integer> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Integer> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Integer value1, Integer value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCalorieIsNull() {
            addCriterion("calorie is null");
            return (Criteria) this;
        }

        public Criteria andCalorieIsNotNull() {
            addCriterion("calorie is not null");
            return (Criteria) this;
        }

        public Criteria andCalorieEqualTo(BigDecimal value) {
            addCriterion("calorie =", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieNotEqualTo(BigDecimal value) {
            addCriterion("calorie <>", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieGreaterThan(BigDecimal value) {
            addCriterion("calorie >", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("calorie >=", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieLessThan(BigDecimal value) {
            addCriterion("calorie <", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieLessThanOrEqualTo(BigDecimal value) {
            addCriterion("calorie <=", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieIn(List<BigDecimal> values) {
            addCriterion("calorie in", values, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieNotIn(List<BigDecimal> values) {
            addCriterion("calorie not in", values, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("calorie between", value1, value2, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("calorie not between", value1, value2, "calorie");
            return (Criteria) this;
        }

        public Criteria andRecommendedIsNull() {
            addCriterion("recommended is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedIsNotNull() {
            addCriterion("recommended is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedEqualTo(Short value) {
            addCriterion("recommended =", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotEqualTo(Short value) {
            addCriterion("recommended <>", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedGreaterThan(Short value) {
            addCriterion("recommended >", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedGreaterThanOrEqualTo(Short value) {
            addCriterion("recommended >=", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedLessThan(Short value) {
            addCriterion("recommended <", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedLessThanOrEqualTo(Short value) {
            addCriterion("recommended <=", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedIn(List<Short> values) {
            addCriterion("recommended in", values, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotIn(List<Short> values) {
            addCriterion("recommended not in", values, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedBetween(Short value1, Short value2) {
            addCriterion("recommended between", value1, value2, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotBetween(Short value1, Short value2) {
            addCriterion("recommended not between", value1, value2, "recommended");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andNutritionCarbohydrateIsNull() {
            addCriterion("nutrition_carbohydrate is null");
            return (Criteria) this;
        }

        public Criteria andNutritionCarbohydrateIsNotNull() {
            addCriterion("nutrition_carbohydrate is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionCarbohydrateEqualTo(BigDecimal value) {
            addCriterion("nutrition_carbohydrate =", value, "nutritionCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andNutritionCarbohydrateNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_carbohydrate <>", value, "nutritionCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andNutritionCarbohydrateGreaterThan(BigDecimal value) {
            addCriterion("nutrition_carbohydrate >", value, "nutritionCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andNutritionCarbohydrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_carbohydrate >=", value, "nutritionCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andNutritionCarbohydrateLessThan(BigDecimal value) {
            addCriterion("nutrition_carbohydrate <", value, "nutritionCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andNutritionCarbohydrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_carbohydrate <=", value, "nutritionCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andNutritionCarbohydrateIn(List<BigDecimal> values) {
            addCriterion("nutrition_carbohydrate in", values, "nutritionCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andNutritionCarbohydrateNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_carbohydrate not in", values, "nutritionCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andNutritionCarbohydrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_carbohydrate between", value1, value2, "nutritionCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andNutritionCarbohydrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_carbohydrate not between", value1, value2, "nutritionCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andNutritionFatIsNull() {
            addCriterion("nutrition_fat is null");
            return (Criteria) this;
        }

        public Criteria andNutritionFatIsNotNull() {
            addCriterion("nutrition_fat is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionFatEqualTo(BigDecimal value) {
            addCriterion("nutrition_fat =", value, "nutritionFat");
            return (Criteria) this;
        }

        public Criteria andNutritionFatNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_fat <>", value, "nutritionFat");
            return (Criteria) this;
        }

        public Criteria andNutritionFatGreaterThan(BigDecimal value) {
            addCriterion("nutrition_fat >", value, "nutritionFat");
            return (Criteria) this;
        }

        public Criteria andNutritionFatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_fat >=", value, "nutritionFat");
            return (Criteria) this;
        }

        public Criteria andNutritionFatLessThan(BigDecimal value) {
            addCriterion("nutrition_fat <", value, "nutritionFat");
            return (Criteria) this;
        }

        public Criteria andNutritionFatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_fat <=", value, "nutritionFat");
            return (Criteria) this;
        }

        public Criteria andNutritionFatIn(List<BigDecimal> values) {
            addCriterion("nutrition_fat in", values, "nutritionFat");
            return (Criteria) this;
        }

        public Criteria andNutritionFatNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_fat not in", values, "nutritionFat");
            return (Criteria) this;
        }

        public Criteria andNutritionFatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_fat between", value1, value2, "nutritionFat");
            return (Criteria) this;
        }

        public Criteria andNutritionFatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_fat not between", value1, value2, "nutritionFat");
            return (Criteria) this;
        }

        public Criteria andNutritionProteinIsNull() {
            addCriterion("nutrition_protein is null");
            return (Criteria) this;
        }

        public Criteria andNutritionProteinIsNotNull() {
            addCriterion("nutrition_protein is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionProteinEqualTo(BigDecimal value) {
            addCriterion("nutrition_protein =", value, "nutritionProtein");
            return (Criteria) this;
        }

        public Criteria andNutritionProteinNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_protein <>", value, "nutritionProtein");
            return (Criteria) this;
        }

        public Criteria andNutritionProteinGreaterThan(BigDecimal value) {
            addCriterion("nutrition_protein >", value, "nutritionProtein");
            return (Criteria) this;
        }

        public Criteria andNutritionProteinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_protein >=", value, "nutritionProtein");
            return (Criteria) this;
        }

        public Criteria andNutritionProteinLessThan(BigDecimal value) {
            addCriterion("nutrition_protein <", value, "nutritionProtein");
            return (Criteria) this;
        }

        public Criteria andNutritionProteinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_protein <=", value, "nutritionProtein");
            return (Criteria) this;
        }

        public Criteria andNutritionProteinIn(List<BigDecimal> values) {
            addCriterion("nutrition_protein in", values, "nutritionProtein");
            return (Criteria) this;
        }

        public Criteria andNutritionProteinNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_protein not in", values, "nutritionProtein");
            return (Criteria) this;
        }

        public Criteria andNutritionProteinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_protein between", value1, value2, "nutritionProtein");
            return (Criteria) this;
        }

        public Criteria andNutritionProteinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_protein not between", value1, value2, "nutritionProtein");
            return (Criteria) this;
        }

        public Criteria andNutritionFibreIsNull() {
            addCriterion("nutrition_fibre is null");
            return (Criteria) this;
        }

        public Criteria andNutritionFibreIsNotNull() {
            addCriterion("nutrition_fibre is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionFibreEqualTo(BigDecimal value) {
            addCriterion("nutrition_fibre =", value, "nutritionFibre");
            return (Criteria) this;
        }

        public Criteria andNutritionFibreNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_fibre <>", value, "nutritionFibre");
            return (Criteria) this;
        }

        public Criteria andNutritionFibreGreaterThan(BigDecimal value) {
            addCriterion("nutrition_fibre >", value, "nutritionFibre");
            return (Criteria) this;
        }

        public Criteria andNutritionFibreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_fibre >=", value, "nutritionFibre");
            return (Criteria) this;
        }

        public Criteria andNutritionFibreLessThan(BigDecimal value) {
            addCriterion("nutrition_fibre <", value, "nutritionFibre");
            return (Criteria) this;
        }

        public Criteria andNutritionFibreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_fibre <=", value, "nutritionFibre");
            return (Criteria) this;
        }

        public Criteria andNutritionFibreIn(List<BigDecimal> values) {
            addCriterion("nutrition_fibre in", values, "nutritionFibre");
            return (Criteria) this;
        }

        public Criteria andNutritionFibreNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_fibre not in", values, "nutritionFibre");
            return (Criteria) this;
        }

        public Criteria andNutritionFibreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_fibre between", value1, value2, "nutritionFibre");
            return (Criteria) this;
        }

        public Criteria andNutritionFibreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_fibre not between", value1, value2, "nutritionFibre");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminAIsNull() {
            addCriterion("nutrition_vitamin_a is null");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminAIsNotNull() {
            addCriterion("nutrition_vitamin_a is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminAEqualTo(BigDecimal value) {
            addCriterion("nutrition_vitamin_a =", value, "nutritionVitaminA");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminANotEqualTo(BigDecimal value) {
            addCriterion("nutrition_vitamin_a <>", value, "nutritionVitaminA");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminAGreaterThan(BigDecimal value) {
            addCriterion("nutrition_vitamin_a >", value, "nutritionVitaminA");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_vitamin_a >=", value, "nutritionVitaminA");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminALessThan(BigDecimal value) {
            addCriterion("nutrition_vitamin_a <", value, "nutritionVitaminA");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminALessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_vitamin_a <=", value, "nutritionVitaminA");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminAIn(List<BigDecimal> values) {
            addCriterion("nutrition_vitamin_a in", values, "nutritionVitaminA");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminANotIn(List<BigDecimal> values) {
            addCriterion("nutrition_vitamin_a not in", values, "nutritionVitaminA");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_vitamin_a between", value1, value2, "nutritionVitaminA");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_vitamin_a not between", value1, value2, "nutritionVitaminA");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminCIsNull() {
            addCriterion("nutrition_vitamin_c is null");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminCIsNotNull() {
            addCriterion("nutrition_vitamin_c is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminCEqualTo(BigDecimal value) {
            addCriterion("nutrition_vitamin_c =", value, "nutritionVitaminC");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminCNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_vitamin_c <>", value, "nutritionVitaminC");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminCGreaterThan(BigDecimal value) {
            addCriterion("nutrition_vitamin_c >", value, "nutritionVitaminC");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminCGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_vitamin_c >=", value, "nutritionVitaminC");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminCLessThan(BigDecimal value) {
            addCriterion("nutrition_vitamin_c <", value, "nutritionVitaminC");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminCLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_vitamin_c <=", value, "nutritionVitaminC");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminCIn(List<BigDecimal> values) {
            addCriterion("nutrition_vitamin_c in", values, "nutritionVitaminC");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminCNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_vitamin_c not in", values, "nutritionVitaminC");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminCBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_vitamin_c between", value1, value2, "nutritionVitaminC");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminCNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_vitamin_c not between", value1, value2, "nutritionVitaminC");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminEIsNull() {
            addCriterion("nutrition_vitamin_e is null");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminEIsNotNull() {
            addCriterion("nutrition_vitamin_e is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminEEqualTo(BigDecimal value) {
            addCriterion("nutrition_vitamin_e =", value, "nutritionVitaminE");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminENotEqualTo(BigDecimal value) {
            addCriterion("nutrition_vitamin_e <>", value, "nutritionVitaminE");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminEGreaterThan(BigDecimal value) {
            addCriterion("nutrition_vitamin_e >", value, "nutritionVitaminE");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_vitamin_e >=", value, "nutritionVitaminE");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminELessThan(BigDecimal value) {
            addCriterion("nutrition_vitamin_e <", value, "nutritionVitaminE");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminELessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_vitamin_e <=", value, "nutritionVitaminE");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminEIn(List<BigDecimal> values) {
            addCriterion("nutrition_vitamin_e in", values, "nutritionVitaminE");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminENotIn(List<BigDecimal> values) {
            addCriterion("nutrition_vitamin_e not in", values, "nutritionVitaminE");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_vitamin_e between", value1, value2, "nutritionVitaminE");
            return (Criteria) this;
        }

        public Criteria andNutritionVitaminENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_vitamin_e not between", value1, value2, "nutritionVitaminE");
            return (Criteria) this;
        }

        public Criteria andNutritionCaroteneIsNull() {
            addCriterion("nutrition_carotene is null");
            return (Criteria) this;
        }

        public Criteria andNutritionCaroteneIsNotNull() {
            addCriterion("nutrition_carotene is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionCaroteneEqualTo(BigDecimal value) {
            addCriterion("nutrition_carotene =", value, "nutritionCarotene");
            return (Criteria) this;
        }

        public Criteria andNutritionCaroteneNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_carotene <>", value, "nutritionCarotene");
            return (Criteria) this;
        }

        public Criteria andNutritionCaroteneGreaterThan(BigDecimal value) {
            addCriterion("nutrition_carotene >", value, "nutritionCarotene");
            return (Criteria) this;
        }

        public Criteria andNutritionCaroteneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_carotene >=", value, "nutritionCarotene");
            return (Criteria) this;
        }

        public Criteria andNutritionCaroteneLessThan(BigDecimal value) {
            addCriterion("nutrition_carotene <", value, "nutritionCarotene");
            return (Criteria) this;
        }

        public Criteria andNutritionCaroteneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_carotene <=", value, "nutritionCarotene");
            return (Criteria) this;
        }

        public Criteria andNutritionCaroteneIn(List<BigDecimal> values) {
            addCriterion("nutrition_carotene in", values, "nutritionCarotene");
            return (Criteria) this;
        }

        public Criteria andNutritionCaroteneNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_carotene not in", values, "nutritionCarotene");
            return (Criteria) this;
        }

        public Criteria andNutritionCaroteneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_carotene between", value1, value2, "nutritionCarotene");
            return (Criteria) this;
        }

        public Criteria andNutritionCaroteneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_carotene not between", value1, value2, "nutritionCarotene");
            return (Criteria) this;
        }

        public Criteria andNutritionThiamineIsNull() {
            addCriterion("nutrition_thiamine is null");
            return (Criteria) this;
        }

        public Criteria andNutritionThiamineIsNotNull() {
            addCriterion("nutrition_thiamine is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionThiamineEqualTo(BigDecimal value) {
            addCriterion("nutrition_thiamine =", value, "nutritionThiamine");
            return (Criteria) this;
        }

        public Criteria andNutritionThiamineNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_thiamine <>", value, "nutritionThiamine");
            return (Criteria) this;
        }

        public Criteria andNutritionThiamineGreaterThan(BigDecimal value) {
            addCriterion("nutrition_thiamine >", value, "nutritionThiamine");
            return (Criteria) this;
        }

        public Criteria andNutritionThiamineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_thiamine >=", value, "nutritionThiamine");
            return (Criteria) this;
        }

        public Criteria andNutritionThiamineLessThan(BigDecimal value) {
            addCriterion("nutrition_thiamine <", value, "nutritionThiamine");
            return (Criteria) this;
        }

        public Criteria andNutritionThiamineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_thiamine <=", value, "nutritionThiamine");
            return (Criteria) this;
        }

        public Criteria andNutritionThiamineIn(List<BigDecimal> values) {
            addCriterion("nutrition_thiamine in", values, "nutritionThiamine");
            return (Criteria) this;
        }

        public Criteria andNutritionThiamineNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_thiamine not in", values, "nutritionThiamine");
            return (Criteria) this;
        }

        public Criteria andNutritionThiamineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_thiamine between", value1, value2, "nutritionThiamine");
            return (Criteria) this;
        }

        public Criteria andNutritionThiamineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_thiamine not between", value1, value2, "nutritionThiamine");
            return (Criteria) this;
        }

        public Criteria andNutritionRiboflavinIsNull() {
            addCriterion("nutrition_riboflavin is null");
            return (Criteria) this;
        }

        public Criteria andNutritionRiboflavinIsNotNull() {
            addCriterion("nutrition_riboflavin is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionRiboflavinEqualTo(BigDecimal value) {
            addCriterion("nutrition_riboflavin =", value, "nutritionRiboflavin");
            return (Criteria) this;
        }

        public Criteria andNutritionRiboflavinNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_riboflavin <>", value, "nutritionRiboflavin");
            return (Criteria) this;
        }

        public Criteria andNutritionRiboflavinGreaterThan(BigDecimal value) {
            addCriterion("nutrition_riboflavin >", value, "nutritionRiboflavin");
            return (Criteria) this;
        }

        public Criteria andNutritionRiboflavinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_riboflavin >=", value, "nutritionRiboflavin");
            return (Criteria) this;
        }

        public Criteria andNutritionRiboflavinLessThan(BigDecimal value) {
            addCriterion("nutrition_riboflavin <", value, "nutritionRiboflavin");
            return (Criteria) this;
        }

        public Criteria andNutritionRiboflavinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_riboflavin <=", value, "nutritionRiboflavin");
            return (Criteria) this;
        }

        public Criteria andNutritionRiboflavinIn(List<BigDecimal> values) {
            addCriterion("nutrition_riboflavin in", values, "nutritionRiboflavin");
            return (Criteria) this;
        }

        public Criteria andNutritionRiboflavinNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_riboflavin not in", values, "nutritionRiboflavin");
            return (Criteria) this;
        }

        public Criteria andNutritionRiboflavinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_riboflavin between", value1, value2, "nutritionRiboflavin");
            return (Criteria) this;
        }

        public Criteria andNutritionRiboflavinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_riboflavin not between", value1, value2, "nutritionRiboflavin");
            return (Criteria) this;
        }

        public Criteria andNutritionNiacinIsNull() {
            addCriterion("nutrition_niacin is null");
            return (Criteria) this;
        }

        public Criteria andNutritionNiacinIsNotNull() {
            addCriterion("nutrition_niacin is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionNiacinEqualTo(BigDecimal value) {
            addCriterion("nutrition_niacin =", value, "nutritionNiacin");
            return (Criteria) this;
        }

        public Criteria andNutritionNiacinNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_niacin <>", value, "nutritionNiacin");
            return (Criteria) this;
        }

        public Criteria andNutritionNiacinGreaterThan(BigDecimal value) {
            addCriterion("nutrition_niacin >", value, "nutritionNiacin");
            return (Criteria) this;
        }

        public Criteria andNutritionNiacinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_niacin >=", value, "nutritionNiacin");
            return (Criteria) this;
        }

        public Criteria andNutritionNiacinLessThan(BigDecimal value) {
            addCriterion("nutrition_niacin <", value, "nutritionNiacin");
            return (Criteria) this;
        }

        public Criteria andNutritionNiacinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_niacin <=", value, "nutritionNiacin");
            return (Criteria) this;
        }

        public Criteria andNutritionNiacinIn(List<BigDecimal> values) {
            addCriterion("nutrition_niacin in", values, "nutritionNiacin");
            return (Criteria) this;
        }

        public Criteria andNutritionNiacinNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_niacin not in", values, "nutritionNiacin");
            return (Criteria) this;
        }

        public Criteria andNutritionNiacinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_niacin between", value1, value2, "nutritionNiacin");
            return (Criteria) this;
        }

        public Criteria andNutritionNiacinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_niacin not between", value1, value2, "nutritionNiacin");
            return (Criteria) this;
        }

        public Criteria andNutritionCholesterolIsNull() {
            addCriterion("nutrition_cholesterol is null");
            return (Criteria) this;
        }

        public Criteria andNutritionCholesterolIsNotNull() {
            addCriterion("nutrition_cholesterol is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionCholesterolEqualTo(BigDecimal value) {
            addCriterion("nutrition_cholesterol =", value, "nutritionCholesterol");
            return (Criteria) this;
        }

        public Criteria andNutritionCholesterolNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_cholesterol <>", value, "nutritionCholesterol");
            return (Criteria) this;
        }

        public Criteria andNutritionCholesterolGreaterThan(BigDecimal value) {
            addCriterion("nutrition_cholesterol >", value, "nutritionCholesterol");
            return (Criteria) this;
        }

        public Criteria andNutritionCholesterolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_cholesterol >=", value, "nutritionCholesterol");
            return (Criteria) this;
        }

        public Criteria andNutritionCholesterolLessThan(BigDecimal value) {
            addCriterion("nutrition_cholesterol <", value, "nutritionCholesterol");
            return (Criteria) this;
        }

        public Criteria andNutritionCholesterolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_cholesterol <=", value, "nutritionCholesterol");
            return (Criteria) this;
        }

        public Criteria andNutritionCholesterolIn(List<BigDecimal> values) {
            addCriterion("nutrition_cholesterol in", values, "nutritionCholesterol");
            return (Criteria) this;
        }

        public Criteria andNutritionCholesterolNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_cholesterol not in", values, "nutritionCholesterol");
            return (Criteria) this;
        }

        public Criteria andNutritionCholesterolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_cholesterol between", value1, value2, "nutritionCholesterol");
            return (Criteria) this;
        }

        public Criteria andNutritionCholesterolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_cholesterol not between", value1, value2, "nutritionCholesterol");
            return (Criteria) this;
        }

        public Criteria andNutritionMagnesiumIsNull() {
            addCriterion("nutrition_magnesium is null");
            return (Criteria) this;
        }

        public Criteria andNutritionMagnesiumIsNotNull() {
            addCriterion("nutrition_magnesium is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionMagnesiumEqualTo(BigDecimal value) {
            addCriterion("nutrition_magnesium =", value, "nutritionMagnesium");
            return (Criteria) this;
        }

        public Criteria andNutritionMagnesiumNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_magnesium <>", value, "nutritionMagnesium");
            return (Criteria) this;
        }

        public Criteria andNutritionMagnesiumGreaterThan(BigDecimal value) {
            addCriterion("nutrition_magnesium >", value, "nutritionMagnesium");
            return (Criteria) this;
        }

        public Criteria andNutritionMagnesiumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_magnesium >=", value, "nutritionMagnesium");
            return (Criteria) this;
        }

        public Criteria andNutritionMagnesiumLessThan(BigDecimal value) {
            addCriterion("nutrition_magnesium <", value, "nutritionMagnesium");
            return (Criteria) this;
        }

        public Criteria andNutritionMagnesiumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_magnesium <=", value, "nutritionMagnesium");
            return (Criteria) this;
        }

        public Criteria andNutritionMagnesiumIn(List<BigDecimal> values) {
            addCriterion("nutrition_magnesium in", values, "nutritionMagnesium");
            return (Criteria) this;
        }

        public Criteria andNutritionMagnesiumNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_magnesium not in", values, "nutritionMagnesium");
            return (Criteria) this;
        }

        public Criteria andNutritionMagnesiumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_magnesium between", value1, value2, "nutritionMagnesium");
            return (Criteria) this;
        }

        public Criteria andNutritionMagnesiumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_magnesium not between", value1, value2, "nutritionMagnesium");
            return (Criteria) this;
        }

        public Criteria andNutritionCalciumIsNull() {
            addCriterion("nutrition_calcium is null");
            return (Criteria) this;
        }

        public Criteria andNutritionCalciumIsNotNull() {
            addCriterion("nutrition_calcium is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionCalciumEqualTo(BigDecimal value) {
            addCriterion("nutrition_calcium =", value, "nutritionCalcium");
            return (Criteria) this;
        }

        public Criteria andNutritionCalciumNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_calcium <>", value, "nutritionCalcium");
            return (Criteria) this;
        }

        public Criteria andNutritionCalciumGreaterThan(BigDecimal value) {
            addCriterion("nutrition_calcium >", value, "nutritionCalcium");
            return (Criteria) this;
        }

        public Criteria andNutritionCalciumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_calcium >=", value, "nutritionCalcium");
            return (Criteria) this;
        }

        public Criteria andNutritionCalciumLessThan(BigDecimal value) {
            addCriterion("nutrition_calcium <", value, "nutritionCalcium");
            return (Criteria) this;
        }

        public Criteria andNutritionCalciumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_calcium <=", value, "nutritionCalcium");
            return (Criteria) this;
        }

        public Criteria andNutritionCalciumIn(List<BigDecimal> values) {
            addCriterion("nutrition_calcium in", values, "nutritionCalcium");
            return (Criteria) this;
        }

        public Criteria andNutritionCalciumNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_calcium not in", values, "nutritionCalcium");
            return (Criteria) this;
        }

        public Criteria andNutritionCalciumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_calcium between", value1, value2, "nutritionCalcium");
            return (Criteria) this;
        }

        public Criteria andNutritionCalciumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_calcium not between", value1, value2, "nutritionCalcium");
            return (Criteria) this;
        }

        public Criteria andNutritionIronIsNull() {
            addCriterion("nutrition_iron is null");
            return (Criteria) this;
        }

        public Criteria andNutritionIronIsNotNull() {
            addCriterion("nutrition_iron is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionIronEqualTo(BigDecimal value) {
            addCriterion("nutrition_iron =", value, "nutritionIron");
            return (Criteria) this;
        }

        public Criteria andNutritionIronNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_iron <>", value, "nutritionIron");
            return (Criteria) this;
        }

        public Criteria andNutritionIronGreaterThan(BigDecimal value) {
            addCriterion("nutrition_iron >", value, "nutritionIron");
            return (Criteria) this;
        }

        public Criteria andNutritionIronGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_iron >=", value, "nutritionIron");
            return (Criteria) this;
        }

        public Criteria andNutritionIronLessThan(BigDecimal value) {
            addCriterion("nutrition_iron <", value, "nutritionIron");
            return (Criteria) this;
        }

        public Criteria andNutritionIronLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_iron <=", value, "nutritionIron");
            return (Criteria) this;
        }

        public Criteria andNutritionIronIn(List<BigDecimal> values) {
            addCriterion("nutrition_iron in", values, "nutritionIron");
            return (Criteria) this;
        }

        public Criteria andNutritionIronNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_iron not in", values, "nutritionIron");
            return (Criteria) this;
        }

        public Criteria andNutritionIronBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_iron between", value1, value2, "nutritionIron");
            return (Criteria) this;
        }

        public Criteria andNutritionIronNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_iron not between", value1, value2, "nutritionIron");
            return (Criteria) this;
        }

        public Criteria andNutritionZincIsNull() {
            addCriterion("nutrition_zinc is null");
            return (Criteria) this;
        }

        public Criteria andNutritionZincIsNotNull() {
            addCriterion("nutrition_zinc is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionZincEqualTo(BigDecimal value) {
            addCriterion("nutrition_zinc =", value, "nutritionZinc");
            return (Criteria) this;
        }

        public Criteria andNutritionZincNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_zinc <>", value, "nutritionZinc");
            return (Criteria) this;
        }

        public Criteria andNutritionZincGreaterThan(BigDecimal value) {
            addCriterion("nutrition_zinc >", value, "nutritionZinc");
            return (Criteria) this;
        }

        public Criteria andNutritionZincGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_zinc >=", value, "nutritionZinc");
            return (Criteria) this;
        }

        public Criteria andNutritionZincLessThan(BigDecimal value) {
            addCriterion("nutrition_zinc <", value, "nutritionZinc");
            return (Criteria) this;
        }

        public Criteria andNutritionZincLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_zinc <=", value, "nutritionZinc");
            return (Criteria) this;
        }

        public Criteria andNutritionZincIn(List<BigDecimal> values) {
            addCriterion("nutrition_zinc in", values, "nutritionZinc");
            return (Criteria) this;
        }

        public Criteria andNutritionZincNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_zinc not in", values, "nutritionZinc");
            return (Criteria) this;
        }

        public Criteria andNutritionZincBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_zinc between", value1, value2, "nutritionZinc");
            return (Criteria) this;
        }

        public Criteria andNutritionZincNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_zinc not between", value1, value2, "nutritionZinc");
            return (Criteria) this;
        }

        public Criteria andNutritionCopperIsNull() {
            addCriterion("nutrition_copper is null");
            return (Criteria) this;
        }

        public Criteria andNutritionCopperIsNotNull() {
            addCriterion("nutrition_copper is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionCopperEqualTo(BigDecimal value) {
            addCriterion("nutrition_copper =", value, "nutritionCopper");
            return (Criteria) this;
        }

        public Criteria andNutritionCopperNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_copper <>", value, "nutritionCopper");
            return (Criteria) this;
        }

        public Criteria andNutritionCopperGreaterThan(BigDecimal value) {
            addCriterion("nutrition_copper >", value, "nutritionCopper");
            return (Criteria) this;
        }

        public Criteria andNutritionCopperGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_copper >=", value, "nutritionCopper");
            return (Criteria) this;
        }

        public Criteria andNutritionCopperLessThan(BigDecimal value) {
            addCriterion("nutrition_copper <", value, "nutritionCopper");
            return (Criteria) this;
        }

        public Criteria andNutritionCopperLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_copper <=", value, "nutritionCopper");
            return (Criteria) this;
        }

        public Criteria andNutritionCopperIn(List<BigDecimal> values) {
            addCriterion("nutrition_copper in", values, "nutritionCopper");
            return (Criteria) this;
        }

        public Criteria andNutritionCopperNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_copper not in", values, "nutritionCopper");
            return (Criteria) this;
        }

        public Criteria andNutritionCopperBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_copper between", value1, value2, "nutritionCopper");
            return (Criteria) this;
        }

        public Criteria andNutritionCopperNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_copper not between", value1, value2, "nutritionCopper");
            return (Criteria) this;
        }

        public Criteria andNutritionManganeseIsNull() {
            addCriterion("nutrition_manganese is null");
            return (Criteria) this;
        }

        public Criteria andNutritionManganeseIsNotNull() {
            addCriterion("nutrition_manganese is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionManganeseEqualTo(BigDecimal value) {
            addCriterion("nutrition_manganese =", value, "nutritionManganese");
            return (Criteria) this;
        }

        public Criteria andNutritionManganeseNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_manganese <>", value, "nutritionManganese");
            return (Criteria) this;
        }

        public Criteria andNutritionManganeseGreaterThan(BigDecimal value) {
            addCriterion("nutrition_manganese >", value, "nutritionManganese");
            return (Criteria) this;
        }

        public Criteria andNutritionManganeseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_manganese >=", value, "nutritionManganese");
            return (Criteria) this;
        }

        public Criteria andNutritionManganeseLessThan(BigDecimal value) {
            addCriterion("nutrition_manganese <", value, "nutritionManganese");
            return (Criteria) this;
        }

        public Criteria andNutritionManganeseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_manganese <=", value, "nutritionManganese");
            return (Criteria) this;
        }

        public Criteria andNutritionManganeseIn(List<BigDecimal> values) {
            addCriterion("nutrition_manganese in", values, "nutritionManganese");
            return (Criteria) this;
        }

        public Criteria andNutritionManganeseNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_manganese not in", values, "nutritionManganese");
            return (Criteria) this;
        }

        public Criteria andNutritionManganeseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_manganese between", value1, value2, "nutritionManganese");
            return (Criteria) this;
        }

        public Criteria andNutritionManganeseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_manganese not between", value1, value2, "nutritionManganese");
            return (Criteria) this;
        }

        public Criteria andNutritionPotassiumIsNull() {
            addCriterion("nutrition_potassium is null");
            return (Criteria) this;
        }

        public Criteria andNutritionPotassiumIsNotNull() {
            addCriterion("nutrition_potassium is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionPotassiumEqualTo(BigDecimal value) {
            addCriterion("nutrition_potassium =", value, "nutritionPotassium");
            return (Criteria) this;
        }

        public Criteria andNutritionPotassiumNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_potassium <>", value, "nutritionPotassium");
            return (Criteria) this;
        }

        public Criteria andNutritionPotassiumGreaterThan(BigDecimal value) {
            addCriterion("nutrition_potassium >", value, "nutritionPotassium");
            return (Criteria) this;
        }

        public Criteria andNutritionPotassiumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_potassium >=", value, "nutritionPotassium");
            return (Criteria) this;
        }

        public Criteria andNutritionPotassiumLessThan(BigDecimal value) {
            addCriterion("nutrition_potassium <", value, "nutritionPotassium");
            return (Criteria) this;
        }

        public Criteria andNutritionPotassiumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_potassium <=", value, "nutritionPotassium");
            return (Criteria) this;
        }

        public Criteria andNutritionPotassiumIn(List<BigDecimal> values) {
            addCriterion("nutrition_potassium in", values, "nutritionPotassium");
            return (Criteria) this;
        }

        public Criteria andNutritionPotassiumNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_potassium not in", values, "nutritionPotassium");
            return (Criteria) this;
        }

        public Criteria andNutritionPotassiumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_potassium between", value1, value2, "nutritionPotassium");
            return (Criteria) this;
        }

        public Criteria andNutritionPotassiumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_potassium not between", value1, value2, "nutritionPotassium");
            return (Criteria) this;
        }

        public Criteria andNutritionPhosphorusIsNull() {
            addCriterion("nutrition_phosphorus is null");
            return (Criteria) this;
        }

        public Criteria andNutritionPhosphorusIsNotNull() {
            addCriterion("nutrition_phosphorus is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionPhosphorusEqualTo(BigDecimal value) {
            addCriterion("nutrition_phosphorus =", value, "nutritionPhosphorus");
            return (Criteria) this;
        }

        public Criteria andNutritionPhosphorusNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_phosphorus <>", value, "nutritionPhosphorus");
            return (Criteria) this;
        }

        public Criteria andNutritionPhosphorusGreaterThan(BigDecimal value) {
            addCriterion("nutrition_phosphorus >", value, "nutritionPhosphorus");
            return (Criteria) this;
        }

        public Criteria andNutritionPhosphorusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_phosphorus >=", value, "nutritionPhosphorus");
            return (Criteria) this;
        }

        public Criteria andNutritionPhosphorusLessThan(BigDecimal value) {
            addCriterion("nutrition_phosphorus <", value, "nutritionPhosphorus");
            return (Criteria) this;
        }

        public Criteria andNutritionPhosphorusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_phosphorus <=", value, "nutritionPhosphorus");
            return (Criteria) this;
        }

        public Criteria andNutritionPhosphorusIn(List<BigDecimal> values) {
            addCriterion("nutrition_phosphorus in", values, "nutritionPhosphorus");
            return (Criteria) this;
        }

        public Criteria andNutritionPhosphorusNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_phosphorus not in", values, "nutritionPhosphorus");
            return (Criteria) this;
        }

        public Criteria andNutritionPhosphorusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_phosphorus between", value1, value2, "nutritionPhosphorus");
            return (Criteria) this;
        }

        public Criteria andNutritionPhosphorusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_phosphorus not between", value1, value2, "nutritionPhosphorus");
            return (Criteria) this;
        }

        public Criteria andNutritionSodiumIsNull() {
            addCriterion("nutrition_sodium is null");
            return (Criteria) this;
        }

        public Criteria andNutritionSodiumIsNotNull() {
            addCriterion("nutrition_sodium is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionSodiumEqualTo(BigDecimal value) {
            addCriterion("nutrition_sodium =", value, "nutritionSodium");
            return (Criteria) this;
        }

        public Criteria andNutritionSodiumNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_sodium <>", value, "nutritionSodium");
            return (Criteria) this;
        }

        public Criteria andNutritionSodiumGreaterThan(BigDecimal value) {
            addCriterion("nutrition_sodium >", value, "nutritionSodium");
            return (Criteria) this;
        }

        public Criteria andNutritionSodiumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_sodium >=", value, "nutritionSodium");
            return (Criteria) this;
        }

        public Criteria andNutritionSodiumLessThan(BigDecimal value) {
            addCriterion("nutrition_sodium <", value, "nutritionSodium");
            return (Criteria) this;
        }

        public Criteria andNutritionSodiumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_sodium <=", value, "nutritionSodium");
            return (Criteria) this;
        }

        public Criteria andNutritionSodiumIn(List<BigDecimal> values) {
            addCriterion("nutrition_sodium in", values, "nutritionSodium");
            return (Criteria) this;
        }

        public Criteria andNutritionSodiumNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_sodium not in", values, "nutritionSodium");
            return (Criteria) this;
        }

        public Criteria andNutritionSodiumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_sodium between", value1, value2, "nutritionSodium");
            return (Criteria) this;
        }

        public Criteria andNutritionSodiumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_sodium not between", value1, value2, "nutritionSodium");
            return (Criteria) this;
        }

        public Criteria andNutritionSeleniumIsNull() {
            addCriterion("nutrition_selenium is null");
            return (Criteria) this;
        }

        public Criteria andNutritionSeleniumIsNotNull() {
            addCriterion("nutrition_selenium is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionSeleniumEqualTo(BigDecimal value) {
            addCriterion("nutrition_selenium =", value, "nutritionSelenium");
            return (Criteria) this;
        }

        public Criteria andNutritionSeleniumNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_selenium <>", value, "nutritionSelenium");
            return (Criteria) this;
        }

        public Criteria andNutritionSeleniumGreaterThan(BigDecimal value) {
            addCriterion("nutrition_selenium >", value, "nutritionSelenium");
            return (Criteria) this;
        }

        public Criteria andNutritionSeleniumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_selenium >=", value, "nutritionSelenium");
            return (Criteria) this;
        }

        public Criteria andNutritionSeleniumLessThan(BigDecimal value) {
            addCriterion("nutrition_selenium <", value, "nutritionSelenium");
            return (Criteria) this;
        }

        public Criteria andNutritionSeleniumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_selenium <=", value, "nutritionSelenium");
            return (Criteria) this;
        }

        public Criteria andNutritionSeleniumIn(List<BigDecimal> values) {
            addCriterion("nutrition_selenium in", values, "nutritionSelenium");
            return (Criteria) this;
        }

        public Criteria andNutritionSeleniumNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_selenium not in", values, "nutritionSelenium");
            return (Criteria) this;
        }

        public Criteria andNutritionSeleniumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_selenium between", value1, value2, "nutritionSelenium");
            return (Criteria) this;
        }

        public Criteria andNutritionSeleniumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_selenium not between", value1, value2, "nutritionSelenium");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}