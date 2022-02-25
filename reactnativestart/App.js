import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View, ScrollView } from 'react-native';
import Card from './components/Card';

export default function App() {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Open up App.js to start working on your app!</Text>
      <ScrollView>
        <Card styles={styles} />
        <Card styles={styles} />
        <Card styles={styles} />
        <Card styles={styles} />
        <Card styles={styles} />
        <Card styles={styles} />
        <Card styles={styles} />
        <Card styles={styles} />
        <Card styles={styles} />
        <Card styles={styles} />
        <Card styles={styles} />
        <Card styles={styles} />
        <Card styles={styles} />
        <Card styles={styles} />
        <Card styles={styles} />
        <Card styles={styles} />
      </ScrollView>
      <StatusBar style="inverted" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'grey',
    alignItems: 'center',
    justifyContent: 'center',
    paddingTop: 100
  },
  title: {
    color: '#fff',
    fontSize: 24,
    marginBottom: 24
  },
  card: {
    backgroundColor: "#fff",
    padding: 12,
    borderRadius: 3,
    margin: 10,
  },
  cardTitle: {
    fontSize: 18,
    fontWeight: "bold"
  },
  cardSubtitle: {
    color: "#999"
  }
});
